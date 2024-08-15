public class Animal {
    String name;
    int age;
    String species;
    static int Animalcount = 0;

    Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
        Animalcount++;
    }

    public void display(){
        System.out.println("Animal name: "+ this.name);
        System.out.println("Animal age: "+ this.age);
        System.out.println("Animal species: " + this.species);
    }
}
