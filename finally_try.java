import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finally_try {
    public static void main(String a[]) throws NumberFormatException, IOException {
        BufferedReader br = null;
        try {//BufferedReader br=new BufferedReader( new InputStreamReader(System.in))//a lso add this then no need to close teh bufferredaer
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } finally {// this statement executes at end always
            br.close();
        }
    }
}
