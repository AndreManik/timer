FROM gradle:8.1.1-jdk17-alpine AS GRADLE_BUILD

COPY "./" "./"
RUN gradle build

FROM azul/zulu-openjdk:17 AS RUN_TIMER
COPY --from=GRADLE_BUILD "/home/gradle/build/libs/timer-0.0.1-SNAPSHOT.jar" "/app/timer.jar"
EXPOSE "8080"
CMD ["java", "-jar", "/app/timer.jar"]
