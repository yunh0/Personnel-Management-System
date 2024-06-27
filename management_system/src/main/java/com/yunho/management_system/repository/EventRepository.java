package com.yunho.management_system.repository;

<<<<<<< Updated upstream
import com.querydsl.core.types.dsl.ComparableExpression;
import com.querydsl.core.types.dsl.StringExpression;
=======
import com.yunho.management_system.constant.EventStatus;
import com.yunho.management_system.dto.EventDto;
>>>>>>> Stashed changes

import com.yunho.management_system.domain.Event;
import com.yunho.management_system.domain.QEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface EventRepository extends
        JpaRepository<Event, Long>,
        QuerydslPredicateExecutor<Event>,
        QuerydslBinderCustomizer<QEvent> {

<<<<<<< Updated upstream
    @Override
    default void customize(QuerydslBindings bindings, QEvent root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.placeId, root.eventName, root.eventStatus, root.eventStartDatetime, root.eventEndDatetime);
        bindings.bind(root.eventName).first(StringExpression::contains);
        bindings.bind(root.eventStartDatetime).first(ComparableExpression::goe);
        bindings.bind(root.eventEndDatetime).first(ComparableExpression::loe);
    }
=======
    default List<EventDto> findEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDatetime,
            LocalDateTime eventEndDatetime
    ) { return List.of(); }
    default Optional<EventDto> findEvent(Long eventId) { return Optional.empty(); }
    default boolean insertEvent(EventDto eventDTO) { return false; }
    default boolean updateEvent(Long eventId, EventDto dto) { return false; }
    default boolean deleteEvent(Long eventId) { return false; }
>>>>>>> Stashed changes

}
