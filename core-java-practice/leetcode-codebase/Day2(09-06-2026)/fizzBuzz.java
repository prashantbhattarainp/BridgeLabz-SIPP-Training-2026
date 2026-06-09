import java.util.*;
public class fizzBuzz {
    public static List<String> fizzbuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                result.add("Fizz");
            } 
            else if (i % 5 == 0) {
                result.add("Buzz");
            } 
            else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = fizzbuzz(n);
        for(int i=0;i<n;i++){
            System.out.print(res.get(i)+" ");
        }
    }

}
