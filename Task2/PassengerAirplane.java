public class PassengerAirplane extends Airplane{
	private int numberOfSeats;
	
	public PassengerAirplane(String boardNumber){
		super(boardNumber);
		System.out.println("Hello from PASSENGER AIRPLANE"); 
	}
	
	public int getNumberOfSeats(){
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats){
		this.numberOfSeats = numberOfSeats;
	}
}