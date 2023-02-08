package services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lservices/Util;", "", "()V", "Companion", "esop_trading"})
public final class Util {
    @org.jetbrains.annotations.NotNull
    public static final services.Util.Companion Companion = null;
    
    public Util() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u00a8\u0006\u0019"}, d2 = {"Lservices/Util$Companion;", "", "()V", "addOrderToBuyList", "", "order", "Lmodels/Order;", "addOrderToPerformanceSellList", "addOrderToSellList", "findOrderQuantity", "", "buyOrder", "sellOrder", "generateOrderExecutionId", "generateOrderId", "matchOrders", "matchWithNonPerformanceSellOrders", "matchWithPerformanceSellOrders", "processOrder", "isPerformanceESOP", "", "updateBuyerInventoryAndWallet", "orderQuantity", "orderExecutionPrice", "updateSellerInventoryAndWallet", "esop_trading"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized long generateOrderId() {
            return 0L;
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized long generateOrderExecutionId() {
            return 0L;
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized void addOrderToBuyList(@org.jetbrains.annotations.NotNull
        models.Order order) {
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized void addOrderToSellList(@org.jetbrains.annotations.NotNull
        models.Order order) {
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized void addOrderToPerformanceSellList(@org.jetbrains.annotations.NotNull
        models.Order order) {
        }
        
        public final void matchOrders() {
        }
        
        private final void matchWithPerformanceSellOrders(models.Order buyOrder) {
        }
        
        private final void matchWithNonPerformanceSellOrders(models.Order buyOrder) {
        }
        
        private final void processOrder(models.Order buyOrder, models.Order sellOrder, boolean isPerformanceESOP) {
        }
        
        private final long findOrderQuantity(models.Order buyOrder, models.Order sellOrder) {
            return 0L;
        }
        
        private final void updateSellerInventoryAndWallet(models.Order sellOrder, long orderQuantity, long orderExecutionPrice, boolean isPerformanceESOP) {
        }
        
        private final void updateBuyerInventoryAndWallet(models.Order buyOrder, long orderQuantity, long orderExecutionPrice) {
        }
    }
}