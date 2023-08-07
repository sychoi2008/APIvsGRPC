package com.example.grpcrealserver;

import io.grpc.stub.StreamObserver;

public class HelloWorldImpl extends HelloWorldGrpc.HelloWorldImplBase{

    @Override
    public void helloWorld(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        int index = request.getIndex();
        int weight = request.getWeight();
        String msg = request.getMsg();
        System.out.println(request);

        HelloResponse helloResponse = HelloResponse.newBuilder()
                .setMessage(
                        "index: " + index + " weight: " + weight + " msg: " + msg )
                .build();

        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }

}
