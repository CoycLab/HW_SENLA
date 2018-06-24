public class Airplane{

	private String boardNumber;
	private int speed;
	private int height;
	private int fuelLevel;
	private PlaneState state;

    Airplane(String boardNumber){
		System.out.println("Hello from AIRPLANE");
		this.boardNumber = boardNumber;
		this.state = PlaneState.HANGAR;
    }
	
	public String getBoardNumber(){
		return boardNumber;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getFuelLevel(){
		return fuelLevel;
	}
	
	public void setFuelLevel(int fuelLevel){
		this.fuelLevel = fuelLevel;
	}
	
	public PlaneState getState(){
		return state;
	}
	
	public void setState(PlaneState state){
		this.state = state;
	}
}