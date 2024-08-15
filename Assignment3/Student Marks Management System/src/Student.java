import java.util.Arrays;

public class Student {
    private String name;
    private String nickname;
    private String address1;
    private String address2;
    public int[] Marks;
    private static int StudentCount;
    private static double HighestGPA = 0;
    private static Student HighStudent;
    public static int[] MeanSubject = {0,0,0,0,0,0};
    private double GPA;

    public Student(String name, String nickname, String address1, int[] Marks){
        this.name = name;
        this.nickname = nickname;
        this.address1 = address1;
        this.Marks = Marks;
        StudentCount++;
    }

    public Student(String name, String nickname, String address1, String address2, int[] Marks){
        this.name = name;
        this.nickname = nickname;
        this.address1 = address1;
        this.address2 = address2;
        this.Marks = Marks;
        StudentCount++;
    }

    public static int getStudentCount(){
        return Student.StudentCount;
    }

    public double CalculateGPA(){
        double total = 0;
        for(int i = 0; i < 6; i++){
            total += this.Marks[i];
            Student.MeanSubject[i] += this.Marks[i];
        }
        this.GPA = (total / 6);
        if (this.GPA > Student.HighestGPA){
            Student.HighestGPA = this.GPA;
            Student.HighStudent = this;
        }
        return this.GPA;
    }

    public void display(){

        System.out.println("Name: "+ this.name);
        System.out.println("Nickname: " + this.nickname);
        System.out.println("Marks: "+ Arrays.toString(this.Marks));
        System.out.printf("GPA: %2.1f %n", this.CalculateGPA());
        System.out.println("Address 1: "+ this.address1);
        if (this.address2 == null){
            System.out.println("Not provided");
        }else{
            System.out.println("Address2: "+ this.address2);
        }
    }

    public static Student getHighStudent(){
        return Student.HighStudent;
    }

    public static int[] getMeanSubject(){
        return Student.MeanSubject;
    }

}
