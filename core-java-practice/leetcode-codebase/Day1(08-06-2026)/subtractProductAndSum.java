import java.util.*;
public class subtractProductAndSum{
    public static int subtractProductandSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int difference = subtractProductandSum(num);
        System.out.print("The difference of product and sum is "+difference);

    }
}