package OnlineRetailManagementSystem;
public class Main {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder( 101,"10-09-2027", "TRK123456","26-10-2027");
        order.display();
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("\nInheritance Check:");
        System.out.println("DeliveredOrder IS-A ShippedOrder: "+ (order instanceof ShippedOrder));
        System.out.println("DeliveredOrder IS-A Order: "+ (order instanceof Order));
    }
}
