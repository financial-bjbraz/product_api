FROM maven:3.8.1-jdk-11 as builder
MAINTAINER BJBraz Developer Team
COPY ./pom.xml /tmp
COPY src/ /tmp/src/
WORKDIR /tmp
RUN mvn package
ARG aws_region
ARG aws_access_key_id
ARG aws_secret_access_key
ENV AWS_REGION=$aws_region
ENV AWS_ACCESS_KEY_ID=$aws_access_key_id
ENV AWS_SECRET_ACCESS_KEY=$aws_secret_access_key
RUN mvn package
FROM openjdk:11
COPY --from=builder /tmp/target/bank_api-0.0.3-SNAPSHOT.jar /tmp/
COPY target/classes/logback-local.xml /config/
EXPOSE 8090

ENV JAVA_OPTS="-Xmx128m -Xms128m -XshowSettings:vm -XX:MetaspaceSize=48m -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseContainerSupport -Dlogging.config=file:/config/logback-local.xml"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /tmp/bank_api-0.0.3-SNAPSHOT.jar" ]