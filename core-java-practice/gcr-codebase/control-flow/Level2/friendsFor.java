import java.util.*;
public class friendsFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int HemantAge=sc.nextInt();
        int PrashantAge=sc.nextInt();
        int SumitAge=sc.nextInt();

        double HemantHeight=sc.nextDouble();
        double PrashantHeight=sc.nextDouble();
        double SumitHeight=sc.nextDouble();

        if(HemantAge<PrashantAge&&HemantAge<SumitAge){
            System.out.println("Hemant is youngest");
        }
        else if(PrashantAge<HemantAge&&PrashantAge<SumitAge){
            System.out.println("Prashant is youngest");
        }
        else{
            System.out.println("Sumit is youngest");
        }

        if(HemantHeight>PrashantHeight&&HemantHeight>SumitHeight){
            System.out.println("Hemant is tallest");
        }
        else if(PrashantHeight>HemantHeight&&PrashantHeight>SumitHeight){
            System.out.println("Prashant is tallest");
        }
        else{
            System.out.println("Sumit is tallest");
        }
    }
}
