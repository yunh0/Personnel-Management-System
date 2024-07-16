# 입장 인원 카운트 관리 서비스

최근, 코로나19 감염 확산을 막기 위한 사회적 거리두기 지침의 일환으로 체육 시설, 음식점, 각종 이벤트 장소는 현재 인원 제한을 적용한 적이 있었다. 그러나 일부 체육관을 포함한 공공시설은 이러한 인원 제한 정보와 시설 이용 현황을 실시간으로 대중에 공유할 수 있는 인프라가 갖춰지지 않았고, 이에 방문객이 시설에 필요에 따라 직접 연락을 취해 확인하는 등 불편이 존재했었다. 

이 프로젝트는 미래에 코로나19와 같은 상황이 일어났을 때, 이러한 불편을 조금이나마 해소하기 위한 목적으로 시작되었다. 입장 인원 카운트 관리 서비스는 쉽게 방문객들이 공공시설 정보를 열람하여 현재 진행 중인 이벤트와 입장 정원, 현재 입장 인원 정보를 확인하고 방문 여부를 결정할 수 있도록 돕는다. 장소의 정보는 장소 관리자에 의해 직접 관리된다.

## 구현 화면
* 이벤트 목록 페이지
![image](https://github.com/user-attachments/assets/a62af9d9-03ff-4d18-88b8-a6a908b22e29)
* 이벤트 상세 페이지
![image](https://github.com/user-attachments/assets/c428e250-1fc5-4f93-92ae-6cf59f04eaea)
* 장소 목록 페이지
![image](https://github.com/user-attachments/assets/3b8ad9b3-4013-4e14-832d-bdd1dfb49b58)
* 장소 상세 페이지
![image](https://github.com/user-attachments/assets/7a814b4d-5f1c-4ccf-920b-dea3f758a3b6)
* 관리자 로그인 페이지
![image](https://github.com/user-attachments/assets/65f08d01-cecf-453a-a2d2-a1069f8db9c3)
* 관리자 장소 추가 후 목록 페이지
![image](https://github.com/user-attachments/assets/06fb10e2-8a6b-4957-9b8d-4e7dfdbc4a80)
* 관리자 장소 수정 페이지
![image](https://github.com/user-attachments/assets/43709048-b5ae-4f3d-8119-700b5a6a7bf4)
* 관리자 이벤트 추가 페이지
![image](https://github.com/user-attachments/assets/c70ad9e5-35bc-4bdc-94f5-dc4c9ab0277f)
* 관리자 이벤트 수정 페이지
![image](https://github.com/user-attachments/assets/32278337-6381-49a6-b427-86bb51f234ec)


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
