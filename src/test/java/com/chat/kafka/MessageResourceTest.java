package com.chat.kafka;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

@QuarkusTest
public class MessageResourceTest {

    @Test
    public void testAddMessage() {

        given()
            .when()
                .body("{\"text\":\"oi\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .post("/messages")
            .then()
                .statusCode(204);
    }
}
