package xlamid.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

// Created by Xlamid
// Date:23.10.2023
// Time: 13:28

public class Person {
    private int id;

    @NotEmpty(message = "fullName should not empty")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message = "Your address must be in the format: Ivanov Ivan Ivanovich")
    @Size(min = 6, max = 100, message = "Name should be between 6 and 100 characters")
    private String fullName;

    @Min(value = 1900, message = "Year of birth should be greater than 1900")
    @Max(value = 2024, message = "Year of birth should be lawyer than 2100")
    private int yearOfBirth;

    public Person() {

    }

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
