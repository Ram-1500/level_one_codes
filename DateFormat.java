package FiftyCodes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today=new Date();
		SimpleDateFormat style=new SimpleDateFormat("dd-MMMM-y HH:mm");
		String date=style.format(today);
		System.out.println(today);
		System.out.println(date);

	}

}
