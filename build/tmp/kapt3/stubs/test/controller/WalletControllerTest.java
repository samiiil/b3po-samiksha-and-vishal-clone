package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007J\b\u0010\u0014\u001a\u00020\u000fH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcontroller/WalletControllerTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "kotlin.jvm.PlatformType", "walletURI", "", "setUp", "", "shouldBeAbleToAddAmount", "shouldNotAbleToAddAmountForInvalidUser", "shouldNotAbleToAddMoreAmountThanSetLimit", "shouldNotBeAbleToAddNegativeAmount", "tearDown", "esop_trading"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest
public final class WalletControllerTest {
    @io.micronaut.http.client.annotation.Client(value = "/")
    @jakarta.inject.Inject
    public io.micronaut.http.client.HttpClient client;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private final java.lang.String walletURI = "/user/user1/addToWallet";
    
    public WalletControllerTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void tearDown() {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void setUp() {
    }
    
    @org.junit.jupiter.api.Test
    public final void shouldNotBeAbleToAddNegativeAmount() {
    }
    
    @org.junit.jupiter.api.Test
    public final void shouldBeAbleToAddAmount() {
    }
    
    @org.junit.jupiter.api.Test
    public final void shouldNotAbleToAddAmountForInvalidUser() {
    }
    
    @org.junit.jupiter.api.Test
    public final void shouldNotAbleToAddMoreAmountThanSetLimit() {
    }
}