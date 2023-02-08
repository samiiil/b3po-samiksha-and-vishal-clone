package services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lservices/Validations;", "", "()V", "Companion", "esop_trading"})
public final class Validations {
    @org.jetbrains.annotations.NotNull
    public static final services.Validations.Companion Companion = null;
    
    public Validations() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J \u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J \u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J \u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0004J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u001b"}, d2 = {"Lservices/Validations$Companion;", "", "()V", "countryCode", "", "phoneNumber", "validDomain", "", "domain", "validLabel", "label", "validateEmailIds", "", "emailId", "validateFirstName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "name", "validateLastName", "validatePhoneNumber", "validateRegisterInput", "body", "Lmodels/RegisterInput;", "validateUser", "userName", "validateUserName", "username", "esop_trading"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> validateRegisterInput(@org.jetbrains.annotations.NotNull
        models.RegisterInput body) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> validateFirstName(@org.jetbrains.annotations.Nullable
        java.lang.String name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> validateLastName(@org.jetbrains.annotations.Nullable
        java.lang.String name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> validateUserName(@org.jetbrains.annotations.Nullable
        java.lang.String username) {
            return null;
        }
        
        public final boolean validateUser(@org.jetbrains.annotations.NotNull
        java.lang.String userName) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Collection<java.lang.String> validateEmailIds(@org.jetbrains.annotations.Nullable
        java.lang.String emailId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> validatePhoneNumber(@org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
            return null;
        }
        
        private final java.lang.String countryCode(java.lang.String phoneNumber) {
            return null;
        }
        
        private final boolean validDomain(java.lang.String domain) {
            return false;
        }
        
        private final boolean validLabel(java.lang.String label) {
            return false;
        }
    }
}