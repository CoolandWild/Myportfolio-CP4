package com.MyportfolioApi.MyportfolioApi.exception;

public class AdminNotFoundException extends RessourceNotFoundException {
    public AdminNotFoundException() {
        super("The page you asked for doesn't exist or is not found");
    }
}