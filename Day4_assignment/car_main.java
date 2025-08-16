package Day4_assignement;

class MyVehicle {
	 void start() {
	     System.out.println("Vehicle is starting...");
	 }
	}
	class Car extends MyVehicle {
	 void start() {
	     System.out.println("Car is starting...");
	 }
	}
	class Bike_h extends MyVehicle {
	 void start() {
	     System.out.println("Bike is starting...");
	 }
	}
	class Truck extends MyVehicle {
	 void start() {
	     System.out.println("Truck is starting...");
	 }
	}
	public class car_main {
	 static void startVehicle(MyVehicle v) {
	     v.start();  
	 }
	 public static void main(String[] args) {
	     MyVehicle car = new Car();
	     MyVehicle bike = new Bike_h();
	     MyVehicle truck = new Truck();
	     startVehicle(car);
	     startVehicle(bike);
	     startVehicle(truck);
	 }
	}