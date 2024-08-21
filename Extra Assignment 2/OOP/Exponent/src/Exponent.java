public class Exponent {
    public static void main(String[] args) {
        int value = 2;

        System.out.println("Square of "+value+" = "+square(value));
        System.out.println("Cube of "+value+" = "+cube(value));

    }

    public static double square(int value){
        return Math.pow(value, 2);
    }

    public static double cube(int value){
        return Math.pow(value, 3);
    }

}