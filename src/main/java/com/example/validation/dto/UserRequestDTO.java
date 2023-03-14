package com.example.validation.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDTO {


    /*********************************
     Validation for the input field that is required for the users
     * ****************************************/
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name must only contain alphabetic characters with no space")
    private String name;

    @NotNull(message = "the address should not be null")
    private String address;

    @Email(message = "this is not correct email")
    private String email;


    @NotNull(message = "Age is mandatory")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 150, message = "Age must be at most 150")
    private Integer age;

    private Double salary;
}
