package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rJ\b\u0010\"\u001a\u00020\u0003H\u0016R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u00a8\u0006#"}, d2 = {"Lmodels/Order;", "", "userName", "", "orderId", "", "orderQuantity", "orderPrice", "orderType", "orderStatus", "(Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;)V", "orderExecutionLogs", "Ljava/util/ArrayList;", "Lmodels/OrderExecutionLogs;", "Lkotlin/collections/ArrayList;", "getOrderExecutionLogs", "()Ljava/util/ArrayList;", "getOrderId", "()J", "getOrderPrice", "getOrderQuantity", "getOrderStatus", "()Ljava/lang/String;", "setOrderStatus", "(Ljava/lang/String;)V", "getOrderType", "remainingOrderQuantity", "getRemainingOrderQuantity", "setRemainingOrderQuantity", "(J)V", "getUserName", "addOrderExecutionLogs", "", "orderExecuted", "toString", "esop_trading"})
public final class Order {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userName = null;
    private final long orderId = 0L;
    private final long orderQuantity = 0L;
    private final long orderPrice = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String orderType = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String orderStatus;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<models.OrderExecutionLogs> orderExecutionLogs = null;
    private long remainingOrderQuantity;
    
    public Order(@org.jetbrains.annotations.NotNull
    java.lang.String userName, long orderId, long orderQuantity, long orderPrice, @org.jetbrains.annotations.NotNull
    java.lang.String orderType, @org.jetbrains.annotations.NotNull
    java.lang.String orderStatus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final long getOrderQuantity() {
        return 0L;
    }
    
    public final long getOrderPrice() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderStatus() {
        return null;
    }
    
    public final void setOrderStatus(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<models.OrderExecutionLogs> getOrderExecutionLogs() {
        return null;
    }
    
    public final long getRemainingOrderQuantity() {
        return 0L;
    }
    
    public final void setRemainingOrderQuantity(long p0) {
    }
    
    public final void addOrderExecutionLogs(@org.jetbrains.annotations.NotNull
    models.OrderExecutionLogs orderExecuted) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}