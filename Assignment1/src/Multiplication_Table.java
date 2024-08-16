import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication_Table {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number: ");
        String myinput = br.readLine();
        System.out.println("Multiplication table for" + myinput);
        for (int i = 1, e = Integer.parseInt(myinput); i < 11; i++){
            System.out.println(e +" * "+ i + " = " + i * e);
        }
    }
}
