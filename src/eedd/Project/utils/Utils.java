package eedd.Project.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	public static int horaCortaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		
		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}
	
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	public static int calcularHorasPendientes (int horaSalida) {
		int result = 0;
		result = horaSalida - horaCortaActual();
		return result;
	}

}