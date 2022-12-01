import java.util.ArrayList; 
import java.util.Arrays;
// I thought you didn't have to import
public class CafeUtil{
    // Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3. and so, on up to 10 and return the result.
    // Does this return a string? The %s
    public int getStreakGoal(){
        int drinkCount = 0;
        for(int i = 1; i <= 10; i++)
        drinkCount += i;
        return drinkCount;
    }

// Given an array of item prices from an order, sum all of the prices in the array and return the total. 

// WHY AM I GETTING 12? 
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
        sum += prices[i];
        }
        return sum;
    }

    // Given an ArrayList of menu items (strings), print out each index and menu item.
    public void displayMenu(ArrayList<String> menuItems){
        System.out.println(menuItems);
        for(int i = 0; i < menuItems.size(); i++){
        String coffeeName = menuItems.get(i);
        System.out.println(i + " " + coffeeName);
        }
        // return coffeeName
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        // system = object
        // get whatever user types will realine after inputing name
        customers.add(userName);
        // adding the object into the array (comming from the parameters)
        System.out.println("Hello" + userName);
        System.out.println("There are " + customers.size() + " " + "people in front of you.");
        System.out.println(customers);

    }
}