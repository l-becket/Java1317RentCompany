FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/rent-company-server-8.0.1-SNAPSHOT.jar ./rent-company.jar
EXPOSE 8080
ENV MONGO_URL=mongodb+srv://root:Anastasia,1992@cluster0.1fn98h1.mongodb.net/user_accounts?retryWrites=true&w=majority
CMD [ "java","-jar", "/app/rent-company.jar" ]