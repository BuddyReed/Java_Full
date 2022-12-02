public class Item{
    public String name;
    public double price;
}


    public Car() {
        this.engine = "V4";
        this.wheels = 4;
        this.automatic = false;
        this.odometer = 0;
        totalCars++;
    }
	public Car(String engine, int wheels, boolean automatic, int odometer) {
		this.engine = engine;
		this.wheels = wheels;
		this.automatic = automatic;
		this.odometer = odometer;
		totalCars++;
	}