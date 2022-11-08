package com.bridgelabz;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
    @BeforeAll
    static void beforeAllTestMsg() {
        System.out.println("-----Welcome to User Registration Problem-----");
    }

    @AfterEach
    public void afterEachTestPassMsg() {
        System.out.println("Passed");
    }

    @Test
    void given_first_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result = validation.checkFirstName("Aditya");
        Assertions.assertEquals(result, true);
    }

    @Test
    void given_last_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result1 = validation.checkLastName("Bharti");
        Assertions.assertEquals(result1, true);
    }

    @Test
    void given_email_id_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result2 = validation.checkemailId("Adityabharti.ab@gmail.com");
        Assertions.assertEquals(result2, true);
    }

    @Test
    void given_phoneNumber_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.phoneNumber("91 9812040783");
        Assertions.assertEquals(result3, true);
    }
}

