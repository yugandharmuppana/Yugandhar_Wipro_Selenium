package Day4_assignement;

class BasicVehicle {
	 BasicVehicle() {
	     System.out.println("Vehicle Created");
	 }
	 void start() {
	     System.out.println("Vehicle is starting...");
	 }
	}
	class Bike extends BasicVehicle {
	 Bike() {
	     super();
	     System.out.println("Bike Created");
	 }

	 void start() {
	     System.out.println("Bike is starting...");
	 }
	}
	abstract class SmartDevice {
	 abstract void turnOn();
	 abstract void turnOff();
	 abstract void performFunction();
	}
	class SmartPhone extends SmartDevice {
	 void turnOn() {
	     System.out.println("SmartPhone is ON");
	 }
	 void turnOff() {
	     System.out.println("SmartPhone is OFF");
	 }
	 void performFunction() {
	     System.out.println("SmartPhone is making calls and browsing");
	 }
	}
	class SmartWatch extends SmartDevice {
	 void turnOn() {
	     System.out.println("SmartWatch is ON");
	 }
	 void turnOff() {
	     System.out.println("SmartWatch is OFF");
	 }
	 void performFunction() {
	     System.out.println("SmartWatch is tracking fitness and showing time");
	 }
	}
	class SmartSpeaker extends SmartDevice {
	 void turnOn() {
	     System.out.println("SmartSpeaker is ON");
	 }
	 void turnOff() {
	     System.out.println("SmartSpeaker is OFF");
	 }
	 void performFunction() {
	     System.out.println("SmartSpeaker is playing music and responding to voice commands");
	 }
	}
	public class Bike_main {
	    public static void main(String[] args) {
	        BasicVehicle v = new Bike();  
	        v.start();               
	        System.out.println("\n--- Smart Devices in Action ---");
	        SmartDevice[] devices = {
	            new SmartPhone(),
	            new SmartWatch(),
	            new SmartSpeaker()
	        };
	        for (SmartDevice device : devices) {
	            device.turnOn();
	            device.performFunction();
	            device.turnOff();
	            System.out.println();
	        }
	    }
	}
