import java.util.*;
public class perimeterOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        int perimeter = (height + width) * 2;

        System.out.println("The perimeter of Rectangle is "+perimeter);
    }
}
