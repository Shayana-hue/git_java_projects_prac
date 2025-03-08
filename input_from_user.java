import java.util.Scanner;

public class input_from_user {
    public static void main(String a[]) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
