package sjtu.dolo.model;

import java.math.BigDecimal;

public class Takes {

    private String secID; //学期编号
    private String semester; //学期
    private String year; //学年
    private String timeSlotID; //时间段编号
    private String courseID; //课号
    private String user_name; //用户名
    private BigDecimal grade; //成绩
    private BigDecimal gpa; //GPA
    private Student student;
    private Section section;

    public Takes() {
    }

    public Takes(String secID, String semester, String year, String timeSlotID, String courseID, String user_name, BigDecimal grade, BigDecimal gpa, Student student, Section section) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.courseID = courseID;
        this.user_name = user_name;
        this.grade = grade;
        this.gpa = gpa;
        this.student = student;
        this.section = section;
    }

    public String getSecID() {
        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigDecimal getGpa() {
        return gpa;
    }

    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Takes{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", student=" + student +
                ", section=" + section +
                '}';
    }
}
