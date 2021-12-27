package com.mytests.micronaut.simple.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Client("http://localhost:8081/pathvars")
public interface PathVarsClient {

    @Get("/tests/{aaa}/{bbb}")
    String fewPathvars(@PathVariable String aaa, @PathVariable String bbb);

    @Get("/state/{plus}/check")
    String plusPathVar(@PathVariable("plus") String arg);
}
