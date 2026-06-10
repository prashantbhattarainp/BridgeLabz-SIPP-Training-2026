import java.util.*;
public class coffeeCounter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Which type of Coffee do you want?");
            String coffeeType = sc.next();
            int bill =0;
            int price=0;
            boolean type = true;
            switch(coffeeType){
                case("Americano"):
                    price = 140;
                break;
                case("Latte"):
                    price = 120;
                    break;
                case("Cappuccino"):
                    price = 160;
                    break;
                case("Expresso"):
                    price = 100;
                    break;
                default:
                    System.out.println("Invalid Coffee Type");
                    type = false;
                    break;
            }
            if(type == true) {
                System.out.println("How much Quantity of "+coffeeType+ " do you want?");
                int quantity = sc.nextInt();
                int GST = (quantity*price)*13/100;
                bill = (price*quantity)+GST;
                System.out.println("Your total bill is "+bill+".");
            } 
            System.out.println("Do you want to continue or exit?");
            String ans = sc.next();
            if(ans.equals("exit")){
                break;
            }
        }
        
    }
}