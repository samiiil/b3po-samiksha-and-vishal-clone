package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\b\u0010\u001a\u001a\u00020\u0004H\u0007\u00a8\u0006\u001b"}, d2 = {"Lmodels/TestOrderCreation;", "", "()V", "can create buy order if user has money in wallet", "", "can create performance sell order if user has enough performance esops", "can create sell order if user has enough esops", "can log or print an order", "cannot create buy order if user doesn\'t have enough money in wallet", "cannot create buy order that will cause inventory limit to be exceeded", "cannot create performance sell order if user doesn\'t have enough performance esops in inventory", "cannot create sell order if user doesn\'t have enough esops in inventory", "cannot create sell order that will cause wallet limit to be exceeded", "correct buy order is created", "correct performance sell order is created", "correct sell order is created", "creating buy order adds order to global buy list", "creating buy order moves money to locked wallet", "creating performance sell order adds order to global performance sell list", "creating performance sell order locks esops", "creating sell order adds order to global sell list", "creating sell order locks esops", "order details for fully filled order is set correctly", "order details for partially filled order is set correctly", "order details for unfilled order is set correctly", "order details is initially empty", "tearDown", "esop_trading"})
public final class TestOrderCreation {
    
    public TestOrderCreation() {
        super();
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void tearDown() {
    }
}