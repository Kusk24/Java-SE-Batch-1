import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int total = 0;
        for (int i = 0 ; i <= 10 ; i++){
            total += i;
        }
        System.out.println("The sum of numbers 1 to 10 = " + total);

        System.out.print("Enter number: ");
        String Input = br.readLine();

        int a = Integer.parseInt(Input);
        int fact = 1;
        while (a > 1){
            fact = fact * a;
            a -= 1;
        }
        System.out.println("The factorial of " + Input + " is " + fact);


        System.out.print("Enter number: ");
        String myinput = br.readLine();
        System.out.println("Multiplication table for" + myinput);
        for (int i = 1, e = Integer.parseInt(myinput); i < 11; i++){
            System.out.println(e +" * "+ i + " = " + i * e);
        }


    }
}