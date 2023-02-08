package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lmodels/TestOrderExecution;", "", "()V", "buyer should get non-performance ESOP even if seller sells performance ESOPs", "", "multiple buy orders by one user and one sell order by another user to fulfill them completely", "setup", "should prioritize buy order that has higher price", "should prioritize order that came first among multiple performance ESOP sell orders irrespective of price", "should prioritize performance ESOP sell orders over non-performance ESOP sell orders", "should prioritize sell order that has lower price", "should take sell price as order price when buy price is higher", "tearDown", "esop_trading"})
public final class TestOrderExecution {
    
    public TestOrderExecution() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void tearDown() {
    }
}