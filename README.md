# Duncok_backend
###

- 구성
```shell
Spring Boot : 3.0.7
Java : 17.x.x
Mybatis
Gradle
Tomcat : tomcat-embed 10.1.8
DB : maria
```

- 구조
```shell
패키지 구분
- controller
- service
- serviceImpl
- mapper
- query.xml
- req/dto
- res/dto
```

- 설정
```shell
- GlobalExceptionHandler : 예외처리를 하지 않은 모든 에러를 제어
```

- 테스트
```shell
http://localhost:8080/aips/duncok/test/getSampleList
```