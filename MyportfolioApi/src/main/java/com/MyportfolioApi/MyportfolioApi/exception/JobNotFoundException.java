package com.MyportfolioApi.MyportfolioApi.exception;

public class JobNotFoundException extends RessourceNotFoundException {
    public JobNotFoundException() {
        super("The Job you asked for doesn't exist or is not found");
    }
}
