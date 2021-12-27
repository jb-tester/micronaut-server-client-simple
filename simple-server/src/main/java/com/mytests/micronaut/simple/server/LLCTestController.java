package com.mytests.micronaut.simple.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Controller("/low-level-client")
public class LLCTestController {

    @Get("/")
    public String root() {
        return "low-level-client test: root";
    }
    @Get("/path1")
    public String path1() {
        return "low-level-client test: path1";
    }
    @Get("/path2")
    public String path2() {
        return "low-level-client test: path2";
    }
    @Get("/path3/{pv}")
    public String path3(@PathVariable String pv) {
        return "low-level-client test: path3 with path variable "+pv;
    }
}
