package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcontroller/FeeCollectedController;", "", "()V", "getFees", "Lio/micronaut/http/HttpResponse;", "Lmodels/FeeResponse;", "esop_trading"})
@io.micronaut.http.annotation.Controller(value = "/fees")
public final class FeeCollectedController {
    
    public FeeCollectedController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/")
    public final io.micronaut.http.HttpResponse<models.FeeResponse> getFees() {
        return null;
    }
}