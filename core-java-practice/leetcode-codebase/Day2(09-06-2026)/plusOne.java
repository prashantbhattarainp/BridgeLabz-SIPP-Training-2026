import java.util.*;
public class plusOne {
    public static int[] plusone(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] digits2=new int [digits.length+1];
        digits2[0]=1;
        return digits2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int[] addedValue = plusone(arr);
        for(int i=0;i<addedValue.length;i++){
            System.out.print(addedValue[i]+" ");
        } 

    }
}
