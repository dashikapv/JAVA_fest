class Vehicle {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public void drive() {
		// TODO Auto-generated method stub
		
	}
}

class Car extends Vehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println("The " + getColor() + " " + model + " car is driving.");
    }
}

class Jeep extends Car {
    public void drive() {
        System.out.println("The " + getColor() + " " + getModel() + " jeep is driving off-road.");
    }
}

class Main {
    // Method Overloading
    public static void calculateMileage(int distance) {
        System.out.println("The vehicle traveled " + distance + " miles.");
    }

    public static void calculateMileage(int distance, double fuelConsumption) {
        double mileage = distance / fuelConsumption;
        System.out.println("The vehicle traveled " + distance + " miles with a fuel consumption of "
                + fuelConsumption + " miles per gallon.");
        System.out.println("The mileage of the vehicle is " + mileage + " miles per gallon.");
    }

    // Method Overriding
    public static void testDrive(Vehicle vehicle) {
        vehicle.drive();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Blue");

        Car car = new Car();
        car.setColor("Red");
        car.setModel("Sedan");

        Jeep jeep = new Jeep();
        jeep.setColor("Green");
        jeep.setModel("SUV");

        // Demonstrate encapsulation
        System.out.println(vehicle.getColor()); // Blue
        vehicle.setColor("Yellow");
        System.out.println(vehicle.getColor()); // Yellow

        // Demonstrate inheritance
        System.out.println(car.getColor()); // Red
        System.out.println(car.getModel()); // Sedan

        // Demonstrate polymorphism - Method Overloading
        calculateMileage(100);
        calculateMileage(100, 10.0);

        // Demonstrate polymorphism - Method Overriding
        testDrive(car);  // Output: "The Red car is driving."
        testDrive(jeep); // Output: "The Green jeep is driving off-road."
    }
}
