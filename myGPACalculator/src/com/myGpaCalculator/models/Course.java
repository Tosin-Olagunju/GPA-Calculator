package com.myGpaCalculator.models;

public class Course {

    private String courseNamePlusCourseCode;
    private int courseUnit;
    private double scores;

    public Course( String courseNamePlusCourseCode, int courseUnit, double scores) {

        this.courseNamePlusCourseCode = courseNamePlusCourseCode;
        this.courseUnit = courseUnit;
        this.scores = scores;

    }

    // getter for courseNamePlusCourseCode
    /**
     * 
     * @return
     * 
     */


    public String getcourseNamePlusCourseCode() {
        return courseNamePlusCourseCode;
    }

    // setter for courseNamePlusCourseCode
    // public void setcourseNamePlusCourseCode(String courseNamePlusCourseCode) {

    //     this.courseNamePlusCourseCode= courseNamePlusCourseCode;
    // }

    // getter for courseUnit
    public int getCourseUnit() {
        return courseUnit;
    }

    // setter for courseUnit
    public void setCourseUnit(int courseUnit) {

        this.courseUnit = courseUnit;
    }

    // getter for scores
    public double getScores() {
        return scores;
    }

    // setter for scores
    public void setScores(double scores) {

        this.scores = scores;
      
    }




    
}
