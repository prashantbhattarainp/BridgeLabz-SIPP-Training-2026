import java.util.*;
public class reduceToZero {
    public static int numberOfSteps(int num) {
        int count =0;
        while(num>0){
            int check = num%2;
            if(check==0){
                count++;
                num=num/2;
            }
            else{
                count++;
                num=num-1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = numberOfSteps(n);
        System.out.print("The steps required to reduce the number to zero is "+ steps);

    }
}
