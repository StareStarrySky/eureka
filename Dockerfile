FROM openjdk
RUN echo "Asia/Shanghai" > /etc/timezone
ENV TZ Asia/Shanghai
ADD ./app.jar /eureka/app.jar
WORKDIR /eureka
CMD ["java", "-jar", "app.jar"]
