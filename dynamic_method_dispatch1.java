class AS {
    public void show() {
        System.out.println("hello AS");
    }
}

class BS extends AS {
    public void show() {
        System.out.println("hello BS");
    }
}

class CS extends BS {
    public void show() {
        System.out.println("hello CS");
    }
}

public class dynamic_method_dispatch1 {
    public static void main(String a[]) {
        AS as = new BS();// in that we can create AS object that refere BS location
        AS ad = new CS();

    }

}
