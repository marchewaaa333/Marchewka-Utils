package xyx.marchewka.marchewkaFiles.methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import xyx.marchewka.marchewkaFiles.util.Loggers;

public class Writer {
	
	public static void Write(String path, String name, String Context) {
	    try {
	    	FileWriter w = new FileWriter(path+File.separator+name);
			w.write(Context);
			w.close();
		} catch (IOException e) {
			Loggers.Log("[File/Writer/Error]", "Failed!");
			e.printStackTrace();
		}
	    
	}

}
