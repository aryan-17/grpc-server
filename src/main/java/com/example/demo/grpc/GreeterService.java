package com.example.demo.grpc;

import com.example.grpc.GreeterGrpc;
import com.example.grpc.HelloReply;
import com.example.grpc.HelloRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String greeting = "Hello, " + request.getName();

        HelloReply reply = HelloReply.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}