package com.example.demo;

import net.devh.boot.grpc.server.serverfactory.GrpcServerFactory;
import net.devh.boot.grpc.server.serverfactory.GrpcServerLifecycle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public GrpcServerLifecycle grpcServerLifecycle(GrpcServerFactory factory) {
        return new GrpcServerLifecycle(factory);
    }
}
