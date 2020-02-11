package JavaAssignS6;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		CarEnCap car = new CarEnCap();
		

		
		car.engine.Capacity = 50;
		car.color = "Red";
		car.door.NumOfDoors = 4;
		car.efficiancy = 35;
		car.type = "SUV";
		car.wheel.NoOfBackup = 2;
		car.wheel.Pressure = 2;
		car.wheel.Type = "Michelline";
		car.wheel.YrOfMake = 2019;
		
		
		//engine1.Capacity = 70;
		
		System.out.println(car.type);
		//System.out.println(engine1.Capacity);
	}

}
