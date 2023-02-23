#Build stage

FROM gradle:latest AS BUILD
WORKDIR /Springboot
COPY . . 
RUN gradle build

# Package stage

FROM openjdk:latest
ENV JAR_NAME=demo-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/Springboot
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8081
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME 



# FROM gradle:latest AS BUILD
# WORKDIR /usr/app/
# COPY . . 
# RUN gradle build

# FROM openjdk:17-jdk-slim-buster

# WORKDIR /Springboot
# COPY . .


# VOLUME /tmp
# EXPOSE 8081
# ADD /build/libs/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
# ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
