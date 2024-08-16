import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number: ");
        String Input = br.readLine();

        int a = Integer.parseInt(Input);
        int fact = 1;
        while (a > 1){
            fact = fact * a;
            a -= 1;
        }
        System.out.println("The factorial of " + Input + " is " + fact);

    }
}
