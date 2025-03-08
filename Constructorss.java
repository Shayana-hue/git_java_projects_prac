class Student {
    private String Name;
    private int Marks;

    public Student() {// Default constructor
        Name = "Navin";
        Marks = 122;
    }

    public Student(int a, String b) {// Parameterized constructor
        this.Marks = a;
        this.Name = b;
    }

    public Student(String name) {// Parameterized constructor with one value
        Name = name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

}

public class Constructorss {
    public static void main(String a[]) {
        Student s1 = new Student();
        Student s2 = new Student(12, "atul");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }

}
