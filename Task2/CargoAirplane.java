public class CargoAirplane extends Airplane{
	private int carringCapacity;
	
	public CargoAirplane(String boardNumber){
		super(boardNumber);
		System.out.println("Hello from CARGO AIRPLANE");
	}
	
	public int getCarringCapacity(){
		return carringCapacity;
	}
	
	public void setCarringCapacity(int carringCapacity){
		this.carringCapacity = carringCapacity;
	}	
}