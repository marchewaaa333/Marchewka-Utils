package io.github.marchewaaa333.marchewkafiles.methods;

import java.io.File;

import io.github.marchewaaa333.marchewkafiles.util.Loggers;

public class GetFileInfo {
	
	public static void GetInfo(String path, String name) {
		File f = new File(path+File.separator+name);
	    if (f.exists()) {
	      Loggers.Log("[GetInfo] ", "File name: " + f.getName());
	      Loggers.Log("[GetInfo] ", "Absolute path: " + f.getAbsolutePath());
	      Loggers.Log("[GetInfo] ", "Writeable: " + f.canWrite());
	      Loggers.Log("[GetInfo] ", "Readable " + f.canRead());
	      Loggers.Log("[GetInfo] ", "File size in bytes " + f.length());
	    } else {
	    	Loggers.Log("[GetInfo] ", "The file does not exist.");
	    }
	}

}
