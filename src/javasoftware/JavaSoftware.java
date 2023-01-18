package javasoftware;

public class JavaSoftware {

    public static void main(String[] args) {
        Student studentlist[]=new Student[3];
        studentlist[0]=new Student("s1","Prabh");
        studentlist[1]=new Student("s2","sid");
        studentlist[2]=new Student("s3","naman");
        for(int i=0;i<3;i++) {
            System.out.println(studentlist[i].getName());
        }
    }
}
