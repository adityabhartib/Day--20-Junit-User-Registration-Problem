package com.bridgelabz;
import java.util.regex.Pattern;

public class UserValidation {
    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public static final String EMAIL_ID="^[A-Za-z]{3,}[.]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
    public static final String PHONE_NUMBER="^[0-9]+\s[0-9]{10}$";
    public static final String PASSWORD_RULE1="^[a-z]{8,}$";
    public Boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }

    public Boolean checkLastName(String lastName) {
        return (Pattern.matches(VALIDATE_NAME,lastName));
    }

    public Boolean checkemailId(String emailId) {
        return (Pattern.matches(EMAIL_ID,emailId));
    }

    public Boolean phoneNumber(String phoneNumber) {
        return (Pattern.matches(PHONE_NUMBER,phoneNumber));
    }

    public Boolean password(String password) {
        return (Pattern.matches(PASSWORD_RULE1,password));
    }
}
