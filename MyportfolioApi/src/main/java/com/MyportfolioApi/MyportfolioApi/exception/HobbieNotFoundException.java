package com.MyportfolioApi.MyportfolioApi.exception;

public class HobbieNotFoundException extends RessourceNotFoundException {
    public HobbieNotFoundException() {
        super("The Hobbie you asked for doesn't exist or is not found");
    }
}
