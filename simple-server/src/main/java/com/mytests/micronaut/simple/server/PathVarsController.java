package com.mytests.micronaut.simple.server;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;

/**
 * *
 * <p>Created by irina on 12/17/2021.</p>
 * <p>Project: micronaut-server-client-simple</p>
 * *
 */
@Controller("/pathvars")
public class PathVarsController {

    @Get(value = "/tests/{t1}/{t2}")
    public String tests(@PathVariable("t1") String t1, @PathVariable String t2){
        return "tests: "+t1 + ", "+t2;
    }
    @Get(value = "/data/{day}{?p1,p2}")
    public String data(@PathVariable("day") String pv5, @Nullable @QueryValue String p1,
                       @Nullable @QueryValue("p2") String param2){
        return "data: "+pv5+" is "+p1+" "+param2;
    }
    @Get(value = "/state/{+state}")
    public String state(@PathVariable("state") String pv5){
        return "state: "+pv5;
    }

}
