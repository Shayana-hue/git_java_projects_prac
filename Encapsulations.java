class Mobile {
    private String Sname;
    private int num = 4;

    public String getSname() {
        return Sname;
    }

    public int getNum() {
        return num;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public void setNum(int num) {
        this.num = num;
    }

}

public class Encapsulations {
    public static void main(String a[]) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.getNum();
        m2.getNum();
        System.out.println(m1.getNum());
        m1.setSname("Naina");
        System.out.print(m1.getSname());
        m2.setSname("aina");
    }
}
