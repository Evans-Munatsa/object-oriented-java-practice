package oop;

public class main {
	
	public static void main(String[] args) {
//		Vehicle vehicle1 = new Vehicle();
//		System.out.println(vehicle1.getName());
//		vehicle1.setName("Mustang");
//		System.out.println(vehicle1.getName());
//		System.out.println(vehicle1.count);
//		
//		Vehicle vehicle2 = new Vehicle("Benz", "Silver", "2013", "Benz", "800");
//		System.out.println(vehicle2.getName());
//		vehicle2.setName("BMW");
//		System.out.println(vehicle2.getName());
//		System.out.println(vehicle2.getSpeed());
//		System.out.println(vehicle2.count);
//		
//		System.out.println(Vehicle.getVehicle());
		
		Car car1 = new Car("Ford Mustang GT", "Silver and Black", "1972", "Ford", "900", true, true);
		System.out.println(car1.getLedScreen());
		System.out.println(car1.getName());
	}
}
