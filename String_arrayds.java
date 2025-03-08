class Student {
    String Sname;
    int RollNo;
    int Marks;

}

public class String_arrayds {
    public static void main(String a[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.Sname = "shj";
        s1.RollNo = 13;
        s1.Marks = 300;
        s2.Sname = "shrtj";
        s2.RollNo = 23;
        s2.Marks = 400;
        s3.Sname = "shzvj";
        s3.RollNo = 33;
        s3.Marks = 500;
        Student stu[] = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].Sname + "" + stu[i].RollNo);
        }
        for (Student studs : stu) {
            System.out.println(studs.Sname + ":" + studs.RollNo);
        }
    }
}
