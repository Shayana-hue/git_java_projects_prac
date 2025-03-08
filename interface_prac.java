interface A {// it is just like abstact class which only defines functions not its
             // functionality
    int number = 23;// variables are final and static in interface
    String name = "naina";

    void show();// no need to add public abstract

    void config();
}

interface B extends A {// one interface inherit other interface by using extends
    void run();
}

class lowerA implements B, A {// use implements to inherit the interface(can inherit multiple interface)

    public void config() {
        System.out.println("In Show");
    }

    public void show() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("In Run");
    }

}

public class interface_prac {
    public static void main(String a[]) {
        A g = new lowerA();
        g.show();
        g.config();
        B b = new lowerA();
        b.show();
        b.run();
        System.out.println(A.name + " " + A.number);// onlu use staticand final variable

    }

}
