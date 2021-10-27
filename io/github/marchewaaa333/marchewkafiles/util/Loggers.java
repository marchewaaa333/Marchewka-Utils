package io.github.marchewaaa333.marchewkafiles.util;

import java.time.*;

public class Loggers {
	
	static String dtf = LocalTime.now().minusSeconds(LocalTime.now().getSecond()).toString();

	public static void Log(String prefix, String text) {
		System.out.println("["+dtf+"]"+" "+prefix+" "+text);
	}
}
