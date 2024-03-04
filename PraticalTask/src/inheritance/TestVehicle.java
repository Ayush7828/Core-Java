package inheritance;

public class TestVehicle {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setvid(4);
		c1.setvname("Honda");
		System.out.println(c1.getvid());
		System.out.println(c1.getvname());

		c1.setcprice(14000000);
		c1.setcname("Honda City");
		System.out.println("CAR Price" + c1.getcprice());
		System.out.println("Car Name" + c1.getccame());

	}

}
