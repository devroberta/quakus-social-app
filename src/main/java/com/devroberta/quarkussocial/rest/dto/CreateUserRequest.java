package com.devroberta.quarkussocial.rest.dto;

import jakarta.json.bind.annotation.JsonbAnnotation;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@JsonbAnnotation
public class CreateUserRequest {

    @NotBlank(message = "Name is Required")
    private String name;

    @NotNull(message = "Age is Required")
    private Integer age;

}
