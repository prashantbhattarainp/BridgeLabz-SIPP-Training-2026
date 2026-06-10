import java.util.*;

public class electionBoothManager {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A_Count = 0;
        int B_Count = 0;
        int C_Count = 0;

        while (true) {

            System.out.println("What's your age?");
            int age = sc.nextInt();

            if (age >= 18) {

                System.out.println("Cast your vote to any one of the following: A, B or C.");
                String candidate = sc.next();

                candidate = candidate.toUpperCase();

                if (candidate.equals("A")) {
                    A_Count++;
                }
                else if (candidate.equals("B")) {
                    B_Count++;
                }
                else if (candidate.equals("C")) {
                    C_Count++;
                }
                else {
                    System.out.println("NOTA");
                }

            }
            else {
                System.out.println("You are not eligible to vote.");
            }

            System.out.println("Does all voters completed their vote? (Yes/No)");
            String ans = sc.next();

            if (ans.equalsIgnoreCase("Yes")) {
                break;
            }
        }

        System.out.println("\nFinal Vote Count:");
        System.out.println("A = " + A_Count);
        System.out.println("B = " + B_Count);
        System.out.println("C = " + C_Count);

        if (A_Count > B_Count && A_Count > C_Count) {
            System.out.println("A is the winner");
        }
        else if (B_Count > A_Count && B_Count > C_Count) {
            System.out.println("B is the winner");
        }
        else if (C_Count > A_Count && C_Count > B_Count) {
            System.out.println("C is the winner");
        }
        else {
            System.out.println("Election resulted in a tie.");
        }

    }
}