class upperd {
    public void show() {
        System.out.println("In A");
    }

    class secondd {
        public void show() {
            System.out.println("In B");
        }
    }
}

class stupper {
    static class stlower {
        public void show() {
            System.out.println("In static B");
        }

    }

}

abstract class N {
    abstract public void show1();

}

public class inner_classd {
    public static void main(String a[]) {
        upperd up = new upperd();
        upperd.secondd sc = up.new secondd();// inner class called by parent class object
        stupper upd = new stupper();
        stupper.stlower st = new stupper.stlower();// only when inner class is static
        st.show();
        N n = new N() {// as this is abstarct calss so we can use it as anoymous class
            public void show1() {
                System.out.println("In anoymous class");// Anonymous class
            }

        };
        n.show1();
    }

}
