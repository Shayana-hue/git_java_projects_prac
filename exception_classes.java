class My_errors_except extends Exception {// inherit class exception for exception creation
    public My_errors_except(String String) {
        super(String);
    }

}

class dr {
    public void show() throws ClassNotFoundException {//ducking throws wxception
        Class.forName("shayana");
    }
}

public class exception_classes {

    public static void main(String a[]) {
        int i = 20;
        int j = 6;
        String s = null;
        int num[] = new int[5];
        try {
            j = 18 / i;
            if (j == 0) {
                throw new My_errors_except("value not to be zero");// cretae own exception
            }
            System.out.println(s.length());
            System.out.println(num[6]);
        } catch (My_errors_except e) {
            j = 18 / 1;
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound array errro");
        } catch (Exception e) {
            System.out.println("something went wrong" + " " + e);
        }
        dr d = new dr();
        try {
            d.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
