package com.MyportfolioApi.MyportfolioApi.exception;

public class DiplomaNotFoundException extends RessourceNotFoundException {
    public DiplomaNotFoundException() {
        super("The Diploma you asked for doesn't exist or is not found");
    }
}