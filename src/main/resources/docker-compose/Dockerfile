FROM java:8-jdk-alpine
COPY ./dockerproject.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch dockerproject.jar'
ENTRYPOINT ["java","-jar","dockerproject.jar"]
