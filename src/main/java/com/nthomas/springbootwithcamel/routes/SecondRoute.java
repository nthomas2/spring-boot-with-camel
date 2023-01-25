package com.nthomas.springbootwithcamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SecondRoute extends RouteBuilder {
    public static final String ROUTE_START = "direct:second";

    @Override
    public void configure() throws Exception {
        from(ROUTE_START)
                .to("http://localhost:8080/second");
    }
}
