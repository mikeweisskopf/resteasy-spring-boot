package com.sample.app;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/sampleresource")
@Component
public class SimpleHello {

    @GET
    @Produces({ MediaType.TEXT_PLAIN })
    @Path("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}