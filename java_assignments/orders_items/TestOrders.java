import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Create the testing file TestOrders and complete the rest of the tasks inside the testing file.
        // Menu items this creat i
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "cappuncino";

        item1.price = 3.0;
        item2.price = 2.5;
        item3.price = 4.0;
        item4.price = 3.0;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cinhuni";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // adding items to an order
        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order3.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Ready: %s\n", order1);
        System.out.printf("Total: %s\n", order4.total);
    }
}