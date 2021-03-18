package rmuti.LiveLab1_1;

public class Student implements Comparable {
    private  String name;
    private  String SurName;
    private String studentID;
    private  double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        Student otherStudent = (Student) o;
        if (this.grade > otherStudent.getGrade()) {
            return 1;
        } else if (this.grade == otherStudent.getGrade()) {
            return 0;
        } else {
            return -1;
        }
    }
}

