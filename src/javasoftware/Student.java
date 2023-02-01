package javasoftware;

/**
 *
 * @author manch
 */
public class Student {
    private String studentId;
    private String name;
    private String studentaddress;
    //hello guys
    public String getStudentaddress() {
        return studentaddress;
    }
    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }
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
