package com.nthomas.springbootwithcamel.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class UpperCaseRoute extends RouteBuilder {
    public static final String ROUTE_START = "direct:uppercase";

    @Override
    public void configure() throws Exception {
        from(ROUTE_START)
                .log(LoggingLevel.DEBUG, "Received message: ${body}");
    }
}
