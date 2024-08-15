import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Libary {
    public static Book[] Booklist = new Book[100];
    public static BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
    public static String title;
    public static String subtitle;
    public static String flag;

    public static Book inputData() throws IOException {
            System.out.print("Enter details for a book Title: ");
            title = br.readLine();
            System.out.print("Subtitle (or press Enter to skip): ");
            subtitle = br.readLine();
            System.out.print("Do you want to enter another book? (yes/no): ");
            flag = br.readLine();
            System.out.println();
            if (subtitle.isEmpty()){
                return new Book(title);
            } else {
                return new Book(title, subtitle);
            }
    }
    public static void main(String[] args) throws IOException {
        do {
            Booklist[Book.getBookCount()] = inputData();
        } while(flag.equalsIgnoreCase("Yes"));

        display();

    }

    public static void display(){
        System.out.println("Library Inventory:");
        for (int i = 0; i < Book.getBookCount(); i ++){
            Booklist[i].display();
            if ( i == Book.getBookCount() - 1){
                System.out.println("Total number books created: " + Book.getBookCount());
            }
            System.out.println();
        }
    }
}