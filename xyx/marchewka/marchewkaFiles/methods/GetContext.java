package xyx.marchewka.marchewkaFiles.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import xyx.marchewka.marchewkaFiles.util.Loggers;

public class GetContext {
	
	public static void get(String path, String name) {
		try {
			File f = new File(path+File.separator+name);
			Scanner r = new Scanner(f);
		     while (r.hasNextLine()) {
		         String data = r.nextLine();
		         System.out.println(data);
		       }
		    r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Loggers.Log("[File/Info/Error]", "An error occurred.");
			Loggers.Log("Path: "+path, "Name: "+name);
		}
		
	}

}
