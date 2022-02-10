package abstractClass;

public class childAirplane extends centralairlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
childAirplane a=new childAirplane();
a.bodyColor();
a.engine();	
		
	}

	@Override
	public void bodyColor() {
		System.out.println("body color");
		
	}
	


}
