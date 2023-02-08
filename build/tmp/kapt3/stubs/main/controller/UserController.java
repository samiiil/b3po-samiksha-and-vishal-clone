package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000bH\u0007J\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\rH\u0007J\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\b\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcontroller/UserController;", "", "()V", "accountInformation", "Lio/micronaut/http/HttpResponse;", "userName", "", "addToInventory", "body", "Lmodels/AddToInventoryInput;", "addToWallet", "Lmodels/AddToWalletInput;", "createOrder", "Lmodels/CreateOrderInput;", "orderHistory", "register", "Lmodels/RegisterResponse;", "Lmodels/RegisterInput;", "esop_trading"})
@io.micronaut.http.annotation.Controller(value = "/user")
public final class UserController {
    
    public UserController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/register")
    public final io.micronaut.http.HttpResponse<models.RegisterResponse> register(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    models.RegisterInput body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/{userName}/addToWallet")
    public final io.micronaut.http.HttpResponse<?> addToWallet(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    models.AddToWalletInput body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/{userName}/addToInventory")
    public final io.micronaut.http.HttpResponse<?> addToInventory(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    models.AddToInventoryInput body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/{userName}/accountInformation")
    public final io.micronaut.http.HttpResponse<?> accountInformation(@org.jetbrains.annotations.NotNull
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/{userName}/createOrder")
    public final io.micronaut.http.HttpResponse<?> createOrder(@org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    models.CreateOrderInput body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/{userName}/orderHistory")
    public final io.micronaut.http.HttpResponse<?> orderHistory(@org.jetbrains.annotations.NotNull
    java.lang.String userName) {
        return null;
    }
}