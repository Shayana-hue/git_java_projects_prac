import calcy.*; //usage of packages as a libraries

class scical extends advc_cal {
    public double pow(int a, int b) {
        return (Math.pow(a, b));
    }

}

public class cal_fun_multilevelInheritance {
    public static void main(String a[]) {
        scical sc = new scical();
        int r1 = sc.add(2, 3);
        int r2 = sc.sub(10, 3);
        int r3 = sc.mul(r1, r2);
        int r4 = sc.div(10, 2);
        double r5 = sc.pow(2, 10);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }

}// Multiple iheritance not supported in java due to ambiguity
