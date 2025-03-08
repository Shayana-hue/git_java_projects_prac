class Mobile {
    static String name;
    int num;
    int model;
    static {
        name = "mobilePhone";
        System.out.println("in static");
    }

    public Mobile() {
        num = 7689798;
        model = 78;

    }

    public void show() {
        System.out.println(name + " " + num + " " + model);
    }

    public static void show1(Mobile obj) {
        System.out.println(name + " " + obj.num + " " + obj.model);// not used non static variables in static method, so
                                                                   // we can use with the help of object
    }
}

public class StaticVariable {
    public static void main(String a[]) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        // Mobile.name = "phone";// Static name called by class name not by objerct name
        // and its value is same
        // // for all objects
        m1.num = 78990;
        m1.model = 5;
        m2.num = 78690;
        m2.model = 4;
        m3.num = 78890;
        m3.model = 9;
        m1.show();
        m2.show();
        Mobile.show1(m1);

    }
}
