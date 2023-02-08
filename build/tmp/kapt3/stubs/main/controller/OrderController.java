package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcontroller/OrderController;", "", "()V", "createOrder", "Lio/micronaut/http/HttpResponse;", "userName", "", "body", "Lmodels/CreateOrderInput;", "esop_trading"})
@io.micronaut.http.annotation.Controller(value = "/user")
public final class OrderController {
    
    public OrderController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/{userName}/createOrder")
    public final io.micronaut.http.HttpResponse<?> createOrder(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    models.CreateOrderInput body) {
        return null;
    }
}