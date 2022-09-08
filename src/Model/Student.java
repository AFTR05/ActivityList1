package Model;

public class Student {
    private String id;
    private String name;
    private String gender;
    private double grade1;
    private double grade2;
    private double average;
    private String career;

    public Student(String id, String name, String gender, double grade1, double grade2, String career) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.average = (grade1+grade2)/2;
        this.career = career;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
