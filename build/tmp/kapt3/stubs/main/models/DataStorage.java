package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lmodels/DataStorage;", "", "()V", "Companion", "esop_trading"})
public final class DataStorage {
    @org.jetbrains.annotations.NotNull
    public static final models.DataStorage.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<java.lang.String, models.User> userList = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.lang.String> registeredEmails = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.lang.String> registeredPhoneNumbers = null;
    private static long orderId = 1L;
    private static long orderExecutionId = 1L;
    @org.jetbrains.annotations.NotNull
    private static final java.util.PriorityQueue<models.Order> buyList = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.PriorityQueue<models.Order> sellList = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.LinkedList<models.Order> performanceSellList = null;
    public static final float COMMISSION_FEE_PERCENTAGE = 2.0F;
    public static final int MAX_AMOUNT = 10000000;
    public static final int MAX_QUANTITY = 10000000;
    @org.jetbrains.annotations.NotNull
    private static java.math.BigInteger TOTAL_FEE_COLLECTED;
    
    public DataStorage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R\u001d\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+0*\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006."}, d2 = {"Lmodels/DataStorage$Companion;", "", "()V", "COMMISSION_FEE_PERCENTAGE", "", "MAX_AMOUNT", "", "MAX_QUANTITY", "TOTAL_FEE_COLLECTED", "Ljava/math/BigInteger;", "getTOTAL_FEE_COLLECTED", "()Ljava/math/BigInteger;", "setTOTAL_FEE_COLLECTED", "(Ljava/math/BigInteger;)V", "buyList", "Ljava/util/PriorityQueue;", "Lmodels/Order;", "getBuyList", "()Ljava/util/PriorityQueue;", "orderExecutionId", "", "getOrderExecutionId", "()J", "setOrderExecutionId", "(J)V", "orderId", "getOrderId", "setOrderId", "performanceSellList", "Ljava/util/LinkedList;", "getPerformanceSellList", "()Ljava/util/LinkedList;", "registeredEmails", "", "", "getRegisteredEmails", "()Ljava/util/Set;", "registeredPhoneNumbers", "getRegisteredPhoneNumbers", "sellList", "getSellList", "userList", "Ljava/util/HashMap;", "Lmodels/User;", "getUserList", "()Ljava/util/HashMap;", "esop_trading"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.HashMap<java.lang.String, models.User> getUserList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> getRegisteredEmails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> getRegisteredPhoneNumbers() {
            return null;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final void setOrderId(long p0) {
        }
        
        public final long getOrderExecutionId() {
            return 0L;
        }
        
        public final void setOrderExecutionId(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.PriorityQueue<models.Order> getBuyList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.PriorityQueue<models.Order> getSellList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.LinkedList<models.Order> getPerformanceSellList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigInteger getTOTAL_FEE_COLLECTED() {
            return null;
        }
        
        public final void setTOTAL_FEE_COLLECTED(@org.jetbrains.annotations.NotNull
        java.math.BigInteger p0) {
        }
    }
}