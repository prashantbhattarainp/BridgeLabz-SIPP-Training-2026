import java.util.*;
public class simpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int principle = sc.nextInt();
        int time = sc.nextInt();
        double rate = sc.nextDouble();

        double simple_Interest = principle*time*rate/100;

        System.out.println("The simple rate is " + simple_Interest);

    }    
}
