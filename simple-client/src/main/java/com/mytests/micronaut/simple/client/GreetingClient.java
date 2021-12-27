package com.mytests.micronaut.simple.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Client(id="http://localhost:8081", path="/greeting")
public interface GreetingClient {

    String ROOT = "/";

    @Get(ROOT)
    String testRoot();

    @Get("/bye")
    String testBye();

    @Get("/greet/{username}")
    String testHi(String username);
}
