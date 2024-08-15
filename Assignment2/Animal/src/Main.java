import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String flag;
    static String name;
    static int age;
    static String species;
    static Animal[] AnimalList = new Animal[100];

    static void inputData() throws IOException {
            System.out.print("Enter animal name: ");
            name = br.readLine();
            System.out.print("Enter animal age: ");
            age = Integer.parseInt(br.readLine());
            System.out.print("Enter animal species: ");
            species = br.readLine();
            System.out.print("Enter \"Yes\" to add new animal, else Enter \"No\": ");
            flag = br.readLine();
    }
    public static void main(String[] args) throws IOException {
        do {
            inputData();
            Animal animal = new Animal(name,age,species);
            AnimalList[Animal.Animalcount - 1] = animal;
        } while(flag.equalsIgnoreCase("Yes"));
        display();
    }

    public static void display() {
        for (int i = 0; i < Animal.Animalcount; i ++){
            System.out.println("Animal "+ (i+1));
            AnimalList[i].display();
        }
    }
}