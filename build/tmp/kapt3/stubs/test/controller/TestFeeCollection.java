package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcontroller/TestFeeCollection;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "setUp", "", "tearDown", "total fee is initially zero", "total fee should be 2 percent of total transaction", "total fee should be rounded and not floored", "esop_trading"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest
public final class TestFeeCollection {
    @io.micronaut.http.client.annotation.Client(value = "/")
    @jakarta.inject.Inject
    public io.micronaut.http.client.HttpClient client;
    
    public TestFeeCollection() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void setUp() {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void tearDown() {
    }
}