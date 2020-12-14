FROM maven:3.6.3-jdk-13

COPY ./pom.xml ./
COPY ./src ./src
RUN mvn clean install
