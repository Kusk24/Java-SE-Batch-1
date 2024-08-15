import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentList = new Student[100];
    static String flag;

    public static void InputData() throws IOException {
        String name;
        String nickname;
        String Address1;
        String Address2;

        do {
            int[] Marks = new int[6];
            System.out.println("Enter details for a new student:");
            System.out.print("Name: ");
            name = br.readLine();
            System.out.print("Nickname: ");
            nickname = br.readLine();
            System.out.println("Enter marks for 6 subjects (or less, defaults to 0)");
            for (int i = 0; i < 6; i ++){
                System.out.print("Subject "+ (i+1) + ":");
                Marks[i] = Integer.parseInt(br.readLine());
            }
            System.out.print("Enter address 1:");
            Address1 = br.readLine();
            System.out.print("Enter address 2(or press Enter to skip): ");
            Address2 = br.readLine();
            System.out.println();
            System.out.print("Do you want to add another student (yes/no): ");
            flag = br.readLine();
            if (Address2.isEmpty()){
                studentList[Student.getStudentCount()] = new Student(name,nickname,Address1,Marks);
            }else{
                studentList[Student.getStudentCount()] = new Student(name, nickname, Address1, Address2, Marks);
            }
        } while ( flag.equalsIgnoreCase("Yes"));
    }
    public static void main(String[] args) throws IOException {

        InputData();
        display();

    }

    public static void display(){
        System.out.println("All student: ");
        for (int i = 0; i < Student.getStudentCount(); i++){
            studentList[i].display();
            System.out.println();
            if (i + 1 == Student.getStudentCount()){
                System.out.println("Mean Marks: ");
                for (int j = 0; j < 6; j++){
                    System.out.printf("Subject %d: %3.1f %n", (j+1), ((double) Student.getMeanSubject()[j] / Student.getStudentCount()));
                }
                System.out.println();
                System.out.println("Student with the highest GPA: ");
                Student.getHighStudent().display();
            }
        }

    }

}