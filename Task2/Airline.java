public class Airline{
	private String name;
	private Airplane[] airplanes;
	
	public Airline(String name){
		this.name = name;
		System.out.println("Hello from AIRLINE");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Airplane[] getAirplanes(){
		return airplanes;
	}
	
	public void setAirplanes(Airplane[] airplanes){
		this.airplanes = airplanes;
	}
}