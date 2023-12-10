package com.myGpaCalculator.service;
import com.myGpaCalculator.models.Course;

public class MyGpaSerices {
    
    public static String checkScoresAndConvertToAlphabetGrade(double scores) {
        if (scores >= 70 && scores <= 100) {
            return "A";
        } else if (scores >= 60 && scores < 70) {
            return "B";
        } else if (scores >= 50 && scores < 60) {
            return "C";
        } else if (scores >= 45 && scores < 50) {
            return "D";
        } else if (scores >= 40 && scores < 45) {
            return "E";
        } else if (scores >= 0 && scores < 40) {
            return "F";
        } else {
            return "Invalid Score";
        }
    }


    public static int convertToNumGrade(double scores) {
        String alphabetGrade = checkScoresAndConvertToAlphabetGrade(scores);

        return switch (alphabetGrade.toUpperCase()) {
            case "A" -> 5;
            case "B" -> 4;
            case "C" -> 3;
            case "D" -> 2;
            case "E" -> 1;
            default -> 0;
        };

    }





    public static double gpaCalculationFormulae(Course[] courses) {
        double totalGradePoints = 0;
        double totalUnits = 0;

        for (Course course : courses) {
            double gradePoint = convertToNumGrade(course.getScores());
            int units = course.getCourseUnit();

            totalGradePoints += gradePoint * units;
            totalUnits += units;
        }

        if (totalUnits == 0) {
            return 0.0;
        }

        return totalGradePoints / totalUnits;
    }
    
}
