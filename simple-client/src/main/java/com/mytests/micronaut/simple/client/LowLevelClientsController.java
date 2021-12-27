package com.mytests.micronaut.simple.client;

import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;
import org.reactivestreams.Publisher;
import reactor.core.publisher.*;
/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Controller
public class LowLevelClientsController {

    @Client("http://localhost:8081/low-level-client") @Inject
    HttpClient httpClient;

    @Get("/llc/root")
    @SingleResult
    public Publisher<String> testLLCRoot(){
        return Mono.from(httpClient.retrieve(HttpRequest.GET("/")));
    }

    @Get("/llc/path1")
    public String testLLCPath1(){
        return httpClient.toBlocking().retrieve("/path1");
    }

    @Get("/llc/path2")
    public String testLLCPath2(){
        String uri = "/path2";
        return httpClient.toBlocking().retrieve(uri);
    }
    @Get("/llc/{pathvar}")
    @SingleResult
    Publisher<String> path3(String pathvar) {
        return Mono.from(httpClient.retrieve(HttpRequest.GET("/path3/" + pathvar)));
    }
}
