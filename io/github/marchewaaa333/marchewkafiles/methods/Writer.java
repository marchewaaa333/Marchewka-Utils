package io.github.marchewaaa333.marchewkafiles.methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.github.marchewaaa333.marchewkafiles.util.Loggers;

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
