import java.util.Scanner;
public class rajResultGenerator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / 5.0;
        int gradeCategory = (int) average / 10;
        String grade;
        switch (gradeCategory) {
            case 10:
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
