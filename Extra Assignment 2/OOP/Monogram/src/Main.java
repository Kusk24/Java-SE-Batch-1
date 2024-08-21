public class Main {
    public static void main(String[] args) {
        char first = 'A';
        char middle = 'C';
        char last = 'D';

        monogramStyle(first,middle,last);
    }

    public static void monogramStyle(char first, char middle, char last){
        System.out.println(first+","+middle+","+last);

        System.out.println(first+","+last+","+middle);
    }

}