package xyx.marchewka.marchewkaFiles.methods;

import java.io.File;
import java.io.IOException;

import xyx.marchewka.marchewkaFiles.util.Loggers;

public class Save {
	
	public static void CreateFile(String path, String name) {
		try {
			File f = new File(path + File.separator + name);
			if (f.createNewFile()) {
				Loggers.Log("[File/Creator]", "File created: " + f.getName());
			} else {
				Loggers.Log("[File/Creator/Error]", "File already exists.");
				Loggers.Log("Path: "+path, "Name: "+name);
			}
		} catch (IOException e) {
			Loggers.Log("[File/Creator/Error]", "An error occurred.");
			Loggers.Log("Path: "+path, "Name: "+name);
			e.printStackTrace();
		}
	}

}
