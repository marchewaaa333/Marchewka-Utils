package xyx.marchewka.marchewkaFiles.methods;

import java.io.File;

import xyx.marchewka.marchewkaFiles.util.Loggers;

public class GetFileInfo {
	
	public static void GetInfo(String path, String name) {
		File myObj = new File(path+File.separator+name);
	    if (myObj.exists()) {
	      Loggers.Log("[GetInfo] ", "File name: " + myObj.getName());
	      Loggers.Log("[GetInfo] ", "Absolute path: " + myObj.getAbsolutePath());
	      Loggers.Log("[GetInfo] ", "Writeable: " + myObj.canWrite());
	      Loggers.Log("[GetInfo] ", "Readable " + myObj.canRead());
	      Loggers.Log("[GetInfo] ", "File size in bytes " + myObj.length());
	    } else {
	    	Loggers.Log("[GetInfo] ", "The file does not exist.");
	    }
	}

}
