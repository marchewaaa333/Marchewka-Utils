package io.github.marchewaaa333.marchewkafiles.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.github.marchewaaa333.marchewkafiles.util.Loggers;

public class GetContext {
	
	public static void get(String path, String name) {
		try {
			File f = new File(path+File.separator+name);
			Scanner r = new Scanner(f);
		     while (r.hasNextLine()) {
		         String data = r.nextLine();
		         System.out.println("[GetContext] "+data);
		       }
		    r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Loggers.Log("[File/Info/Error]", "An error occurred.");
			Loggers.Log("Path: "+path, "Name: "+name);
		}
		
	}

}
