// Create a Java program that demonstrates the use of constructor chaining to initialize objects of a
// class hierarchy. The program should consist of the following classes:
// 1. A superclass called "Vehicle" with the following fields:
// ● make (string)
// ● model (string)
// ● year (integer)
// ● color (string)
// 2. The "Vehicle" class should have the following constructors:
// ● A default constructor that initializes all fields to empty or zero values.
// ● A parameterized constructor that takes values for all fields.
// ● A constructor that takes only the make, model, and year fields and sets the color
// to "unknown".

// 3. A subclass called "Car" that extends "Vehicle" and adds the following fields:
// ● numDoors (integer)
// ● automatic (boolean)
// 4. The "Car" class should have the following constructors:
// ● A default constructor that calls the default constructor of its superclass and sets
// the "numDoors" and "automatic" fields to default values.
// ● A parameterized constructor that takes values for all fields and calls the
// parameterized constructor of its superclass.
// ● A constructor that takes only the make, model, and year fields and sets the
// "numDoors" and "automatic" fields to default values, and calls the corresponding
// constructor of its superclass.

// 5. A subclass called "Truck" that extends "Vehicle" and adds the following fields:
// ● payloadCapacity (double)
// ● towingCapacity (double)
// 6. The "Truck" class should have the following constructors:
// ● A default constructor that calls the default constructor of its superclass and sets
// the "payloadCapacity" and "towingCapacity" fields to default values.
// ● A parameterized constructor that takes values for all fields and calls the
// parameterized constructor of its superclass.
// ● A constructor that takes only the make, model, and year fields and sets the
// "payloadCapacity" and "towingCapacity" fields to default values, and calls the
// corresponding constructor of its superclass.

class Vehicle{
    String make;
    String model;
    int year;
    String color;
    public Vehicle() {
        this.make=null;
        this.color=null;
        this.year=0;
        this.color= null;
    }
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    
}
class Car extends Vehicle{
    int numDoors;
    boolean automatic;
    Car(){
        super();
        this.numDoors=4;
        this.automatic=true;

    }
    public Car(String make, String model, int year, String color, int numDoors, boolean automatic) {
        super(make, model, year, color);
        this.numDoors = numDoors;
        this.automatic = automatic;
    }
    public Car(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.numDoors=2;
        this.automatic=true;
    }
    
}
class Truck extends Vehicle{
    double payloadCapacity;
    double towingCapacity;
    public Truck() {
        super();
        this.payloadCapacity=10;
        this.towingCapacity=2;
    }
    public Truck(String make, String model, int year, String color, double payloadCapacity, double towingCapacity) {
        super(make, model, year, color);
        this.payloadCapacity = payloadCapacity;
        this.towingCapacity = towingCapacity;
    }
    
    
}