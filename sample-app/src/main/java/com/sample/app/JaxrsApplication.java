package com.sample.app;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS application
 *
 * Created by facarvalho on 12/7/15.
 */
@Component
@ApplicationPath("/v1/raptormidverification/")
public class JaxrsApplication extends Application {
}
