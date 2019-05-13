package pe.edu.cibertec.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class Util {

	public Util() {

	}

	public static String _obt_fecha() {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String s = sm.format(new Date());

		return s.toString();
	}
 
	public static String _sumarDiasFecha(String T, Integer D) throws ParseException{  
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date=df.parse(T);
	 
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, D);
		String _fec_vecimiento = _convertirxfecha((calendar.getTime().toString()));
		 
		return _fec_vecimiento;
	}
	public static String _convertirxfecha(String T) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		
		Date parsedDate = sdf.parse(T); 
		SimpleDateFormat print = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 
		return print.format(parsedDate);
	}

	public static String _convertirxhora(String T) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

		Date parsedDate = sdf.parse(T);
		SimpleDateFormat print = new SimpleDateFormat("HH:mm:ss");
		 
		return print.format(parsedDate);
	}
	 
	public static String _obt_dia(Boolean T) {
		if (T) {
			return "SI";
		} else {
			return "NO";
		}
	}

	public static Boolean _obt_dia_b(String T) {

		switch (T) {
		case "SI":
			return true; 
		default:
			return false; 
		}
 
	}
 
}
