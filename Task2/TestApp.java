public class TestApp{
	public static void main(String[] args){
		Airplane airplane = new Airplane("ASD-111");
		Airline airline = new Airline("Grodno Airlines");
		Airplane passengerAirplane = new PassengerAirplane("PA-123");
		Airplane cargoAirplane = new CargoAirplane("CA-456");		
	}
}