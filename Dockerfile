FROM openjdk:11
VOLUME /tmp
VOLUME /home/harika
EXPOSE 8080
ARG JAR_FILE=target/springboot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} /home/harika/harikaravi.jar
ENTRYPOINT ["java","-jar","/home/harika/harikaravi.jar"]
