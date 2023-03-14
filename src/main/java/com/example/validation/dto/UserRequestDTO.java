package com.example.validation.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDTO {

//    @NotNull(message = "the name should not be null")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name must only contain alphabetic characters")
    private String name;

    @NotNull(message = "the address should not be null")
    private String address;

    @Email(message = "this is not correct email")
    private String email;


    @Size(min = 10, max = 50, message = "your above the required age, btn 10 and 50")
    private Integer age;

    //    @NotEmpty
    private Double salary;
}
