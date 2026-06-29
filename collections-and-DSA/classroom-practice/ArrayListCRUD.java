import java.util.ArrayList;

public class ArrayListCRUD {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After Create: " + list);


        System.out.println("First Element: " + list.get(0));
        System.out.println("All Elements: " + list);

        list.set(1, "Orange");
        System.out.println("After Update: " + list);

        list.remove("Apple");  
        System.out.println("After Delete: " + list);
    }
}