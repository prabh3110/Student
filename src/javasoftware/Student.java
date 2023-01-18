/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasoftware;

/**
 *
 * @author manch
 */
public class Student {
    private String studentId;
    private String name;
    Student(String studentId, String name) {
        this.studentId=studentId;
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    
}
