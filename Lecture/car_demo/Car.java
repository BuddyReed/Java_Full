public class Car{
    // MEMBER VARIABLES, ATTRIBUTES, CRITERIA (REFERENCE MEMVARIABLE IN PLATOFRM)
    // Making the member veriable private prevents any other class to change. You use GETTER and SETTER to adjust
    private String engine;
    private int wheels;
    private boolean automatic;
    private int odometer;

    // CONSTRUCTOR METHODS
    // EMPTY CONSTUCTOR 
    public Car(){
        this.engine = "V4";
        this.wheels = 4;
        this.automatic = true;
        this.odometer = 0;
        // this("V4", 4, true, 0); 
        // above is the system overload. (reference overload in platform) 
        System.out.println("DEFAULT CAR BEING MADE"); // REVIEW
    }
    // FULL CONSTRUTOR
    public car(String engine, int wheels, boolean automatic,int odometer ){
        System.out.println("CAR BEING INSTANTIATE"); 
        this.engine = engine;
        this.wheels = wheels;
        this.automatic = automatic;
        this.odometer = odometer;
    }

    // GETTERS / SETTERS/ OTHER METHODS Need to assign a GETTER and SETTER to all Variables.

    // Method
    public void drive(int mileage){
        this.odometer = mileage
    }
    
    // GETTER ENGINE
    public String getEngine(){
        return this.engine;
    }

    // SETTER ENGINE VOID is used because it does retrieve any variables.
    public void setEngine(String engine){
        this.engine = engine;

    }

    public int getOdometer(int odometer){
        return this.odometer
    }


}