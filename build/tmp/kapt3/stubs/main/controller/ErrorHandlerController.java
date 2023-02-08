package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcontroller/ErrorHandlerController;", "", "()V", "handleCustomErrors", "Lio/micronaut/http/HttpResponse;", "Lmodels/ErrorResponse;", "exception", "Lexception/ValidationException;", "handleEmptyBody", "handleInvalidJson", "handleInvalidRoute", "request", "Lio/micronaut/http/HttpRequest;", "handleUserNotFound", "Lexception/UserNotFoundException;", "handleWrongHttpMethod", "esop_trading"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class ErrorHandlerController {
    
    public ErrorHandlerController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, exception = com.fasterxml.jackson.core.JsonParseException.class)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleInvalidJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, exception = io.micronaut.web.router.exceptions.UnsatisfiedBodyRouteException.class)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleEmptyBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, status = io.micronaut.http.HttpStatus.NOT_FOUND)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleInvalidRoute(@org.jetbrains.annotations.NotNull
    io.micronaut.http.HttpRequest<?> request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, exception = exception.UserNotFoundException.class)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleUserNotFound(@org.jetbrains.annotations.NotNull
    exception.UserNotFoundException exception) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, status = io.micronaut.http.HttpStatus.METHOD_NOT_ALLOWED)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleWrongHttpMethod(@org.jetbrains.annotations.NotNull
    io.micronaut.http.HttpRequest<?> request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Error(global = true, exception = exception.ValidationException.class)
    public final io.micronaut.http.HttpResponse<models.ErrorResponse> handleCustomErrors(@org.jetbrains.annotations.NotNull
    exception.ValidationException exception) {
        return null;
    }
}