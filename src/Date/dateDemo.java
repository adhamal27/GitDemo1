package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Date d=new Date();
			
			SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyy E hh:mm:ss");
			System.out.println(d.toString());
			System.out.println(sdf.format(d));
	}

}
