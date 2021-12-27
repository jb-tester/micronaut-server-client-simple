package com.mytests.micronaut.simple.client;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Controller
public class ClientsController {

    @Inject
    GreetingClient greetingClient;

    @Get("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return greetingClient.testHi(name);
    }

    @Get("/sayBye")
    public String sayBye() {
        return greetingClient.testBye();
    }

    @Get("/root")
    public String getRoot() {
        return greetingClient.testRoot();
    }
    @Get("/test")
    public String test() {
        return "test that it works";
    }
}
