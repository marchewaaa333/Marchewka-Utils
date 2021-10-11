package xyx.marchewka.marchewkaFiles.util;

import java.time.*;

public class Loggers {
	
	static String dtf = LocalTime.now().minusSeconds(LocalTime.now().getSecond()).toString();

	public static void Log(String prefix, String text) {
		System.out.println("["+dtf+"]"+" "+prefix+" "+text);
	}
}
