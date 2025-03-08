abstract class david {// class must be abstarct type if it conatines an abstract method
    public abstract void show();// used only to define teh method
}

class davidd extends david {//Concrete class
    public void show() {// derived must use the abstarct method of base class
        System.out.println("hi");

    }
}

public class abstract_keyww {
    public static void main(String a[]) {
        // david ds=new david() ;//can not create abject of abstarct class
        david df = new davidd();// that is possible

    }
}
