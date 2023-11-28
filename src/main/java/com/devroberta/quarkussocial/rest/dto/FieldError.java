package com.devroberta.quarkussocial.rest.dto;

import lombok.Data;

@Data
public class FieldError {

    private String Field;
    private String message;

    public FieldError(String field, String message) {
        Field = field;
        this.message = message;
    }

}
