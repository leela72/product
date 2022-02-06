FROM maven:3.6.0-jdk-8 AS builder

#copy local code to the container image
WORKDIR /app
COPY pom.xml /app
COPY src ./src

#Build the release artifact
RUN mvn -f /app/pom.xml clean package -DskipTests

#
# Package stage
#
FROM openjdk:8
COPY --from=builder /app/target/ProductMs*.jar /demo.war

EXPOSE 8586
CMD java -jar /demo.war