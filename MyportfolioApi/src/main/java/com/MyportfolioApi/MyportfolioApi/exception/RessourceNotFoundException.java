package com.MyportfolioApi.MyportfolioApi.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RessourceNotFoundException extends RuntimeException {

    public RessourceNotFoundException(String message) {
        super(message);
    }

}
