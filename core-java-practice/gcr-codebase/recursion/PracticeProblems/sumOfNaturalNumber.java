import java.util.*;
public class sumOfNaturalNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printOneToNSum(n));
    }
    public static int printOneToNSum(int n){
        if(n <= 1){
            return 1; 
        }
        return n + printOneToNSum(n-1);
    }
}
