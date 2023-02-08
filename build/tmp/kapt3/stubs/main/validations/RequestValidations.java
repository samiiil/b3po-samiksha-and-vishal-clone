package validations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvalidations/RequestValidations;", "", "()V", "Companion", "esop_trading"})
public final class RequestValidations {
    @org.jetbrains.annotations.NotNull
    public static final validations.RequestValidations.Companion Companion = null;
    
    public RequestValidations() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ,\u0010\n\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ,\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u00072\u0006\u0010\r\u001a\u00020\u0005J\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u00072\u0006\u0010\u000f\u001a\u00020\u0005\u00a8\u0006\u0010"}, d2 = {"Lvalidations/RequestValidations$Companion;", "", "()V", "checkIfFieldsMissingInOrderReq", "", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "body", "Lmodels/CreateOrderInput;", "checkIfOrderRequestDataIsValid", "checkIfRequestIsValid", "isESOPTypeValid", "typeOfESOP", "isOrderTypeValid", "orderType", "esop_trading"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> checkIfRequestIsValid(@org.jetbrains.annotations.NotNull
        models.CreateOrderInput body) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> checkIfFieldsMissingInOrderReq(@org.jetbrains.annotations.NotNull
        models.CreateOrderInput body) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> checkIfOrderRequestDataIsValid(@org.jetbrains.annotations.NotNull
        models.CreateOrderInput body) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> isOrderTypeValid(@org.jetbrains.annotations.NotNull
        java.lang.String orderType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> isESOPTypeValid(@org.jetbrains.annotations.NotNull
        java.lang.String typeOfESOP) {
            return null;
        }
    }
}