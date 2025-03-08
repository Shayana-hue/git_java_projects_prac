enum Status {// to define constants
    Running(23), Failed(21), Pending, Success(25);

    private int ratio;

    private Status(int ratio) {
        this.ratio = ratio;
    }

    private Status() {
        this.ratio = 34;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

}

public class enum_prac {
    public static void main(String a[]) {
        Status s = Status.Success;// to get only one value from enum

        System.out.println(s + " " + ":" + s.ordinal() + s.getRatio());// ordinal gives the location
        Status[] ss = Status.values();// make array if want to access all values
        for (Status s1 : ss) {
            System.out.println(s1 + " " + ":" + s1.ordinal() + "-" + s1.getRatio());
        }
    }

}
