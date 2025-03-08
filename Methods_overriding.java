class AB {

    public int show(int n, int m) {
        return n + m;
    }
}

class BA extends AB {
    // public int show(int a, int b) {//method overirding
    // return a * b;
    // }
}

public class Methods_overriding {
    public static void main(String a[]) {
        BA b = new BA();
        int r = b.show(1, 2);
        System.out.println("Method_overriding" + " " + r);

    }

}
