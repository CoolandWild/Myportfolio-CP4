package com.MyportfolioApi.MyportfolioApi.exception;

public class CreationNotFoundException extends RessourceNotFoundException {
    public CreationNotFoundException() {
        super("The Creation you asked for doesn't exist or is not found");
    }
}
