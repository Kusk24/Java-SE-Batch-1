public class Main {
    public static void main(String[] args) {
        MyTime Time = new MyTime(23,59,59);
        System.out.println(Time);
        System.out.println("next Second = "+Time.nextSecond());;
        System.out.println("next Minute = "+Time.nextMinute());
        System.out.println("next Hour = "+Time.nextHour());
        System.out.println("previous Hour = "+Time.previousHour());
        System.out.println("previous Minute = "+Time.previousMinute());
        System.out.println("previous Hour = "+Time.previousHour());
        System.out.println("previous Second = "+Time.previousSecond());
    }
}