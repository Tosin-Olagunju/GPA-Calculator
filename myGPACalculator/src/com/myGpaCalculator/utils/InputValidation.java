package com.myGpaCalculator.utils;

public class InputValidation {


    public static boolean isValidCourseScore(int courseScore) {
        return courseScore >= 0 && courseScore <= 100;
    }

    

    public static boolean isValidCourseNameAndCode(String courseName) {
        return courseName != null && !courseName.trim().isEmpty() && courseName.matches("^[a-zA-Z]{3}[- ]?[0-9]{3}$");
    }

    public static boolean isValidInteger(String input) {
        try {
            // Remove leading zeros from the input string
            String trimmedInput = input.replaceFirst("^0+", "");
    
            // Parse the trimmed input string to an integer
            int parsedInt = Integer.parseInt(trimmedInput);
    
            // Additional check for non-negative integers
            return parsedInt > 0;
        } catch (NumberFormatException e) {
            // Parsing failed, input is not a valid integer
            return false;
        }
    }
    
}
