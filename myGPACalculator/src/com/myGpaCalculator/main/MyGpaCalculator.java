package com.myGpaCalculator.main;
import com.myGpaCalculator.models.Course;
import com.myGpaCalculator.service.MyGpaSerices;
import com.myGpaCalculator.utils.ConsoleDisplay;


public class MyGpaCalculator {


    public static void main(String[] args) {
        System.out.println("GPA Calculator");

        int numberOfCourses = ConsoleDisplay.retrievePositiveNumber("Enter the number of Courses: ");

        Course[] courses = new Course[numberOfCourses];

        for (int i = 0; i < numberOfCourses; i++) {
              Course course = captureCourseInput(i);
            courses[i] = course;

        }

        printCourseInfo(courses);

        double gpa = MyGpaSerices.gpaCalculationFormulae(courses);
        System.out.printf("\nYour GPA is: %.2f\n", gpa);

    }

    private static void printCourseInfo(Course[] courses) {
        System.out.println("\nCourse details and grades:\n");

        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (Course course : courses) {
            String grade = MyGpaSerices.checkScoresAndConvertToAlphabetGrade(course.getScores());
            int gradePoint = MyGpaSerices.convertToNumGrade(course.getScores());

            System.out.format("| %-27s| %-21s | %-10s | %-19s |\n" , 
                    course.getcourseNamePlusCourseCode(), course.getCourseUnit(), grade, gradePoint);
        }
        System.out.println("|---------------------------------------------------------------------------------------|");

    }

    private static Course captureCourseInput(int index) {
        int count = index + 1;
        System.out.println("\nEnter details for Course #" + count);

        String courseNameAndCode = ConsoleDisplay.retrieveCourseNameAndCode("Course Name And Code: ");
        int units = ConsoleDisplay.retrieveCourseUnit("Units: ");
        double score = ConsoleDisplay.retrieveCourseScore("Score: ");

        return new Course(courseNameAndCode, units, score);
    }
    
}




