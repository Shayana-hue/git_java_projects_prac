class Calculator {
    int result;

    public int add(int n1, int n2) {
        result = n1 + n2;
        return result;
    }
}

public class Hello {
    public static void main(String a[]) {
        int number1 = 56;
        int number2 = 57;
        Calculator calc = new Calculator();
        int res = calc.add(number1, number2);
        System.out.println(res);
    }
}