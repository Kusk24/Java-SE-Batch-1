public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        rectangleComputation(5,10);
        cylinderComputation(8,3);
        printPattern();
        checkPassFail(59);
        checkOddEven(88);
    }

    //Q1
    public static void rectangleComputation(int length, int width){
        int rectangleArea = length*width;
        System.out.println("Rectangle area = "+rectangleArea);
    }

    //Q2
    public static void cylinderComputation(int radius, int height){
        double Area = 2*Math.PI*radius*height;
        System.out.printf("Surface area of a cylinder = %.3f\n", Area);
    }

    //Q3
    public static void printPattern(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //Q4
    public static void checkPassFail(int mark){
        if (mark >= 50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }

    //Q5
    public static void checkOddEven(int number){
        if(number % 2 == 0){
            System.out.println("number "+number+" is Even Number");
        }else{
            System.out.println("number "+number+" is Odd Number");
        }
    }
}