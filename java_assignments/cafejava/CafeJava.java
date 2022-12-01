public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.5;
        double latte = 5.0;
        double cappuccino = 6.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = " Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // Cindhuri order 
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
        
        // Noah Order 
        if(isReadyOrder4) {
        System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino);
        }
        else{
        System.out.println(customer4 + pendingMessage);
        }

        // Sam Order 
        System.out.println(customer2 + displayTotalMessage + (latte + latte));
        if(isReadyOrder2) {
        System.out.println(customer2 + readyMessage);
        }
        else{
        System.out.println(customer2 + pendingMessage);
        }

        // Jimmy Order 
        System.out.println( customer3 + displayTotalMessage + (latte - dripCoffeePrice));
    	// ** Your customer interaction print statements will go here ** //
    }
}