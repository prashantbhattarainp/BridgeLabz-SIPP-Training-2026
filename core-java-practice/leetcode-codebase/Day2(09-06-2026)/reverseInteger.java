import java.util.*;
public class reverseInteger {
     public static int reverse(int x) {
        int duplicate= x;
        if(x<0){
            x=x*-1;
        }
        int res=0;
        while(x>0){
            int last=x%10;
            if(res>Integer.MAX_VALUE/10){
                return 0;
            }
            res=res*10+last;
            x=x/10;
        }
        if(duplicate<0){
            return res*-1;
        }
        else{
            return res;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = reverse(num);
        System.out.print("The reverse Integer is "+reverseNum);

    }
}
