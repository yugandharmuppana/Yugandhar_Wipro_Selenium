package Day4_assignement;

//Parent class
class Vehicle {
	void showVehicleType() {
		System.out.println("This is a vehicle.");
	}
}

//Child class
class FourWheeler extends Vehicle {
	void showWheelerType() {
		System.out.println("This is a four wheeler.");
	}
}

//Subchild class
class PetrolFourWheeler extends FourWheeler {
	void showFuelType() {
		System.out.println("This four wheeler uses petrol.");
	}
}

//Another subchild class
class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
	void showSeatingCapacity() {
		System.out.println("This petrol four wheeler has 5 seats.");
	}
}

//Final subchild class
class Baleno extends FiveSeaterPetrolFourWheeler {
	void showCarModel() {
		System.out.println("This is a Baleno - 5 seater petrol four wheeler.");
	}
}
public class Vehicle_multilevel {
	public static void main(String[] args) {
		Baleno myCar = new Baleno();
		myCar.showVehicleType();
		myCar.showWheelerType();
		myCar.showFuelType();
		myCar.showSeatingCapacity();
		myCar.showCarModel();
	}
}

