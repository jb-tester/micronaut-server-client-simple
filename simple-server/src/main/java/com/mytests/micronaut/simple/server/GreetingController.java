package com.mytests.micronaut.simple.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Controller("/greeting")
public class GreetingController {

    @Get
    public String top(){
        return "you are here";
    }


    @Get("/bye")
    public String sayBye(){
        return "have a good day";
    }
    @Get("/greet/{name}")
    public String sayHi(String name) {
        return "hello " + name;
    }

    }
