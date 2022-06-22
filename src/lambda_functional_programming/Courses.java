package lambda_functional_programming;

public class Courses {

    /*
    POJO Plain Old Java Project
    variables
    getters and setters
    constructors
    toString
     */

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1)Constructor without parameter
    public Courses() {

    }

    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return Season;
    }


    public void setSeason(String season) {
        Season = season;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {

        return "season: " + this.Season + " CourseName: " + courseName + " AverageScore: " + averageScore + " NumberOfStudents : " +
                numberOfStudents;

    }
}
