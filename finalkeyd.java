//final on variable,class and method
final class fg {// class will not be inherited

    public void show() {
        System.out.println("Hello");
    }

}

class th {//@override is anotation
    final public void show() {// only this method called when its subclass call show method even also when
                              // derived calss have same method
        System.out.println("Hello");
    }
}

class to extends th {
    // public void show(){Show error
    // System.out.println("Hello");
    // }
}

public class finalkeyd {
    public static void main(String a[]) {
        final int adi = 8;// make variable adi as const variable, no one change its value
        // adi=7;//not worked

    }
}
