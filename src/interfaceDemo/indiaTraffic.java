package interfaceDemo;

public class indiaTraffic implements centralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		centralTraffic a =new indiaTraffic();
		
		a.redSignal();
		a.yellowSignal();
		a.greenSignal();
	}

	@Override
	public void redSignal() {
		System.out.println("Red signal");
		
	}

	@Override
	public void yellowSignal() {
		// TODO Auto-generated method stub
		System.out.println("yellow signal");
	}

	@Override
	public void greenSignal() {
		// TODO Auto-generated method stub
		System.out.println("Green signal");
	}

}
