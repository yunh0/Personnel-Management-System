# 입장 인원 카운트 관리 서비스

최근, 코로나19 감염 확산을 막기 위한 사회적 거리두기 지침의 일환으로 체육 시설, 음식점, 각종 이벤트 장소는 현재 인원 제한을 적용한 적이 있었다. 그러나 일부 체육관을 포함한 공공시설은 이러한 인원 제한 정보와 시설 이용 현황을 실시간으로 대중에 공유할 수 있는 인프라가 갖춰지지 않았고, 이에 방문객이 시설에 필요에 따라 직접 연락을 취해 확인하는 등 불편이 존재했었다. 

이 프로젝트는 미래에 코로나19와 같은 상황이 일어났을 때, 이러한 불편을 조금이나마 해소하기 위한 목적으로 시작되었다. 입장 인원 카운트 관리 서비스는 쉽게 방문객들이 공공시설 정보를 열람하여 현재 진행 중인 이벤트와 입장 정원, 현재 입장 인원 정보를 확인하고 방문 여부를 결정할 수 있도록 돕는다. 장소의 정보는 장소 관리자에 의해 직접 관리된다.

## 개발 환경

* Intellij IDEA Ultimate
* Java 17
* Spring Boot 2.5.3
* Gradle

## 기술 세부 스택

Spring Boot

* Spring Boot Actuator
* Spring Data JPA
* Rest Repositories HAL Explorer
* Validation
* Spring Web
* Thymeleaf
* Spring Security
* H2 Database
* MySQL Driver
* Lombok
* Spring Configuration Processor

그 외

* QueryDSL
* Tailwind CSS

## ERD
![장소 인원 관리 시스템 drawio](https://github.com/yunh0/Personnel-Management-System/assets/114940378/0aa1fe72-3c96-4d8a-8fb0-c327d0a10d7f)
