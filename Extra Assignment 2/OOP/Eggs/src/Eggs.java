import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eggs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter numbers of Eggs: ");
        int numberOfEggs = Integer.parseInt(br.readLine());

        eggDozens(numberOfEggs);
    }

    public static void eggDozens(int numberOfEggs){
        int dozen = numberOfEggs/12;
        int remaining = numberOfEggs%12;

        System.out.println("Total eggs are "+ dozen +" full dozen (with "+remaining+" eggs remaining)");
    }
}