@FunctionalInterface // only works with interface class which have only one function
interface practice {
    int show(int n, int m);
}

public class interface_Lambda {
    public static void main(String a[]) {
        // practice p = new practice() {
        // public void show() {
        // System.out.println("Hi functional interface");
        // }
        // };
        // practice p = () -> System.out.println("Hi functional interface");// Lambda
        // creation
        // p.show();
        practice p = (i, j) -> i + j;// Lambda creation(for parameterized function)
        int result = p.show(2, 5);
        System.out.println(result);
    }

}
