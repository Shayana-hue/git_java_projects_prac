class A {
    public A() {
        super();// If we not specify this super function it automatically calls and this point
                // to super class and in that class A extends object class by default
        System.out.println("In A");
    }

    public A(int a) {
        super();
        System.out.println("Int A");
    }
}

class B extends A {
    public B() {
        super();// calls default constructor of class A
        System.out.println("In B");
    }

    public B(int a) {

        super(a);// calls parametrzed constructor of A

        System.out.println("Int B");
    }

    public B(String b) {
        this();// calls default constructor of B
        System.out.println("string this");
    }

}

public class Thsi_super {
    public static void main(String a[]) {
        new B();// Anonymous object, we cannot reuse it again
        B b = new B();
        B b1 = new B(7);
        B b2 = new B("Navin");
    }

}
