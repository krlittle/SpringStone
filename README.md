# SpringStone
![#005B00](https://placehold.it/15/005B00/000000?text=+) SpringStone's <code>master</code> branch is working

SpringStone is a full stack Spring Boot application that will wrap the [unofficial Hearthstone API on Mashape](https://market.mashape.com/omgvamp/hearthstone).

The purpose of this project is to serve as a boilerplate for making simple Hearthstone websites.

You need to have a Mashape account and then declare an application to retrieve a key.

Missing from this repository is the `application-secret.properties` file which contains the credentials I used to validate my application with the [unofficial Hearthstone API on Mashape](https://market.mashape.com/omgvamp/hearthstone).  If you wish to pick this up and use it as your own, you will need to provide an `application-secret.properties` file under the `src/main/resources` directory.

In your `application-secret.properties` file, you will want to provide the following:

```
input.key=<the key to your application that your registered on Mashape for the unofficial Hearthstone API>
```
## How to Run
Run `SpringStoneServer.java` and open your browser to http://localhost:8081

## API Documentation
API Documentation is provided through Swagger UI.  To access this documentation, open your browser to http://localhost:8081/swagger-ui.html
