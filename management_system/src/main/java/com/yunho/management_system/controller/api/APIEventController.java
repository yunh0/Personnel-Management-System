package com.yunho.management_system.controller.api;

import com.yunho.management_system.constant.EventStatus;
import com.yunho.management_system.dto.APIDataResponse;
import com.yunho.management_system.dto.EventRequest;
import com.yunho.management_system.dto.EventResponse;
import com.yunho.management_system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Spring Data REST 로 API 를 만들어서 당장 필요가 없어진 컨트롤러.
 * 우선 deprecated 하고, 향후 사용 방안을 고민해 본다.
 * 필요에 따라서는 다시 살릴 수도 있음
 *
 * @deprecated 0.1.2
 */
@Deprecated
@RequiredArgsConstructor
//@Validated
//@RequestMapping("/api")
//@RestController
public class APIEventController {

    private final EventService eventService;

    @GetMapping("/events")
    public APIDataResponse<List<EventResponse>> getEvents(
            @Positive Long placeId,
            @Size(min = 2) String eventName,
            EventStatus eventStatus,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime eventStartDatetime,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime eventEndDatetime
    ) {
        List<EventResponse> eventResponses = eventService.getEvents(
                placeId,
                eventName,
                eventStatus,
                eventStartDatetime,
                eventEndDatetime
        ).stream().map(EventResponse::from).toList();

        return APIDataResponse.of(eventResponses);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/events")
    public APIDataResponse<String> createEvent(@Valid @RequestBody EventRequest eventRequest) {
        boolean result = eventService.createEvent(eventRequest.toDTO());

        return APIDataResponse.of(Boolean.toString(result));
    }

    @GetMapping("/events/{eventId}")
    public APIDataResponse<EventResponse> getEvent(@Positive @PathVariable Long eventId) {
        EventResponse eventResponse = EventResponse.from(eventService.getEvent(eventId).orElse(null));

        return APIDataResponse.of(eventResponse);
    }

    @PutMapping("/events/{eventId}")
    public APIDataResponse<String> modifyEvent(
            @Positive @PathVariable Long eventId,
            @Valid @RequestBody EventRequest eventRequest
    ) {
        boolean result = eventService.modifyEvent(eventId, eventRequest.toDTO());
        return APIDataResponse.of(Boolean.toString(result));
    }

    @DeleteMapping("/events/{eventId}")
    public APIDataResponse<String> removeEvent(@Positive @PathVariable Long eventId) {
        boolean result = eventService.removeEvent(eventId);

        return APIDataResponse.of(Boolean.toString(result));
    }

}