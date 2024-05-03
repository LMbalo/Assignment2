package com.example.demo.Model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 11, message = "Course code must be at most 10 characters")
    @Column(name = "CourseCode")
    private String courseCode;

    @NotNull
    @Size(max = 255, message = "Course name must be at most 255 characters")
    @Column(name = "CourseName")
    private String courseName;

    // Constructors
    public Courses() {
    }

    public Courses(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}


