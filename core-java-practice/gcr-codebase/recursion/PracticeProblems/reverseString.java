import java.util.*;
public class reverseString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(reverseStringRecursive(n, n.length() - 1, ""));
    }
    public static String reverseStringRecursive(String n, int m, String res){
        if(m < 0){
            return res; 
        }
        return reverseStringRecursive(n, m-1, res+n.charAt(m));
    }
}
