
public class Car {
	Person owner;
	double price;
	String model;
	String location;
	
	Car(String model, double price) {
		this.model = model;
		this.price = price;
		this.owner = null;
		this.location = "Car Dealership";
	}
	
	void driveTo(String location) {
		this.owner.location = location;
		this.location = location;
		System.out.println(this.owner.name + " drove their " + this.model + " to " + location + ".");
	}
}
