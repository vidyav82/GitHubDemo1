package JavaAssignS6;

public class AirPlane  {

	static void Method1(AirPlane A) {}
	static void Method2(AirPlane A) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boeing B1 = new Boeing();
		//Boeing B2 = new Boeing();
		AirBus A1 = new AirBus();
		//AirBus A2 = new AirBus();
		//AirPlane AP = new AirPlane();
		
		Method1(B1);
		Method2(A1);
		
		B1.TakeOff();
		B1.TakeDown();
		A1.TakeOff();
		A1.TakeDown();
		
	}

}
