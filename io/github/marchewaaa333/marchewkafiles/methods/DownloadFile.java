package io.github.marchewaaa333.marchewkafiles.methods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import io.github.marchewaaa333.marchewkafiles.util.Loggers;

public class DownloadFile {
	
	public static void Download(String URL, String Path) throws IOException {
		URL website;
		try {
			Loggers.Log("[Download/MarchewkaFiles]", "Trying to download file...");
			website = new URL(URL);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(Path);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		} catch (MalformedURLException e) {
			Loggers.Log("[Download/MarchewkaFiles]", "Failed while downloading file " + URL); 
		}
		
	}

}
