import java.util.*;

public class fitnessTracker {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your weight?");
        double weight = sc.nextDouble();

        System.out.println("What's your height?");
        double height = sc.nextDouble() / 100;

        double BMI = weight / (height * height);

        System.out.printf("Your BMI is %.2f%n", BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight");
        }
        else if (BMI >= 18.5 && BMI < 24.5) {
            System.out.println("You are of healthy-weight");
        }
        else {
            System.out.println("You are overweight");
        }
    }
}