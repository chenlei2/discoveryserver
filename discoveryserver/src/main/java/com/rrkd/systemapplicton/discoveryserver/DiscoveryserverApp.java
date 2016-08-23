package com.rrkd.systemapplicton.discoveryserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryserverApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryserverApp.class).web(true).run(args);
    }

}