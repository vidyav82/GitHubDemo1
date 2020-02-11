package JavaAssignS6;

public class Engine {

	String Fuel;
	int Speed;
	int Capacity;
	int YrOfMfg;
	private int EngineId;
	
	public void SetEngine(int Id) {
		EngineId = Id;
	}
	
	public int GetEngineId() {
		return EngineId;
	}
}
