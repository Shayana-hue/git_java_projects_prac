class robots {

}

public class practice {
    public static void main(String a[]) {
        int num[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
                System.out.println(num[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();

        }
        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
