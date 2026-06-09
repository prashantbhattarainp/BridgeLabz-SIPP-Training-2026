import java.util.*;
public class palindromeNumber{
    public static boolean isPalindrome(int x) {
        int duplicate = x;
        int check =0;
        while(duplicate>0){
            int last = duplicate%10;
            check = check*10+last;
            duplicate=duplicate/10;
        }
        if(check==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = isPalindrome(num);
        if(check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}