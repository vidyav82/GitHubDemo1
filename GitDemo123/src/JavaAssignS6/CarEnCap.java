package JavaAssignS6;

public class CarEnCap {
	String color;
	String type;
	int efficiancy;
	int speed;
	Engine engine;
	Seat seat;
	Door door;
	Wheel wheel;
	
	public CarEnCap() {
		this.engine = new Engine();
		this.seat = new Seat();
		this.door = new Door();
		this.wheel = new Wheel();
	}
}
