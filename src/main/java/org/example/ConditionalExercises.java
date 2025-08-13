package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        if (x < 5) {
            return true;
        } else {
            return false;
        }
    }


    public String getAgeGroup(int age) {

        if (age < 13) {
            return "Child";
        } else if (age > 12 && age < 20) {
            return "Teen";
        } else {
            return "Adult";
        }
        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
