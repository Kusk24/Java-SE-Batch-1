import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    private static int num1 = 0;
    private static int num2 = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        inputData();
        sum(num1, num2);
        differece(num1,num2);
    }

    public static void inputData() throws IOException{
        System.out.print("Enter Number 1: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter Number 2: ");
        num2 = Integer.parseInt(br.readLine());
    }

    public static void sum(int num1,int num2){
        System.out.println("The sum of two numbers is "+(num1+num2));
    }

    public static void differece(int num1, int num2){
        System.out.println("The difference of two numbers is " + (num1-num2));
    }

}