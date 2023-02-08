package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aJ\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J(\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u0003J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0006\u0010\'\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\u001aJ\u0006\u0010)\u001a\u00020\u001aJ\u0006\u0010*\u001a\u00020\u001aJ\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020\u001aJ:\u0010-\u001a6\u0012\u0004\u0012\u00020\u0003\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010.0\u0010j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010.`\u00120.J\u000e\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u001aJ\u000e\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u001aJ\u000e\u00103\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u001aJ\u0018\u00104\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u00105\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u00106\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u001aR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006="}, d2 = {"Lmodels/User;", "", "username", "", "firstName", "lastName", "phoneNumber", "emailId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "account", "Lmodels/Account;", "getEmailId", "()Ljava/lang/String;", "getFirstName", "getLastName", "orders", "Ljava/util/ArrayList;", "Lmodels/Order;", "Lkotlin/collections/ArrayList;", "getOrders", "()Ljava/util/ArrayList;", "getPhoneNumber", "getUsername", "addBuyOrder", "", "orderQuantity", "", "orderPrice", "addEsopToInventory", "esopsToBeAdded", "type", "addMoneyToWallet", "amountToBeAdded", "addNonPerformanceSellOrder", "addOrderToExecutionQueue", "orderType", "typeOfESOP", "addPerformanceSellOrder", "addSellOrder", "getFreeInventory", "getFreeMoney", "getFreePerformanceInventory", "getLockedInventory", "getLockedMoney", "getLockedPerformanceInventory", "getOrderDetails", "", "moveFreeInventoryToLockedInventory", "esopsToBeLocked", "moveFreeMoneyToLockedMoney", "amountToBeLocked", "moveFreePerformanceInventoryToLockedPerformanceInventory", "throwExceptionIfInvalidBuyOrder", "throwExceptionIfInvalidNonPerformanceEsopSellOrder", "throwExceptionIfInvalidPerformanceEsopSellOrder", "updateLockedInventory", "inventoryToBeUpdated", "isPerformanceESOP", "", "updateLockedMoney", "amountToBeUpdated", "esop_trading"})
public final class User {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String emailId = null;
    private final models.Account account = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<models.Order> orders = null;
    
    public User(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.String emailId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmailId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<models.Order> getOrders() {
        return null;
    }
    
    public final void addOrderToExecutionQueue(long orderQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String orderType, long orderPrice, @org.jetbrains.annotations.NotNull
    java.lang.String typeOfESOP) {
    }
    
    private final void addBuyOrder(long orderQuantity, long orderPrice) {
    }
    
    private final void throwExceptionIfInvalidBuyOrder(long orderQuantity, long orderPrice) {
    }
    
    private final void addSellOrder(long orderQuantity, long orderPrice, java.lang.String typeOfESOP) {
    }
    
    private final void addPerformanceSellOrder(long orderQuantity, long orderPrice) {
    }
    
    private final void addNonPerformanceSellOrder(long orderQuantity, long orderPrice) {
    }
    
    private final void throwExceptionIfInvalidNonPerformanceEsopSellOrder(long orderQuantity, long orderPrice) {
    }
    
    private final void throwExceptionIfInvalidPerformanceEsopSellOrder(long orderQuantity, long orderPrice) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>> getOrderDetails() {
        return null;
    }
    
    public final void addMoneyToWallet(long amountToBeAdded) {
    }
    
    public final long getFreeMoney() {
        return 0L;
    }
    
    public final long getLockedMoney() {
        return 0L;
    }
    
    public final void updateLockedMoney(long amountToBeUpdated) {
    }
    
    public final void moveFreeMoneyToLockedMoney(long amountToBeLocked) {
    }
    
    public final void addEsopToInventory(long esopsToBeAdded, @org.jetbrains.annotations.NotNull
    java.lang.String type) {
    }
    
    public final long getFreeInventory() {
        return 0L;
    }
    
    public final long getLockedInventory() {
        return 0L;
    }
    
    public final long getFreePerformanceInventory() {
        return 0L;
    }
    
    public final long getLockedPerformanceInventory() {
        return 0L;
    }
    
    public final void updateLockedInventory(long inventoryToBeUpdated, boolean isPerformanceESOP) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String moveFreeInventoryToLockedInventory(long esopsToBeLocked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String moveFreePerformanceInventoryToLockedPerformanceInventory(long esopsToBeLocked) {
        return null;
    }
}