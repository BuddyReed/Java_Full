import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + " Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
    // YOUR CODE HERE
    return "Good " + dayPeriod + ", " + name + " Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE ----- Reference Modulariztion Table
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir.";
        }
        else if(conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally";
        }
        else{ 
            return "Right and with that I shall retire";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}