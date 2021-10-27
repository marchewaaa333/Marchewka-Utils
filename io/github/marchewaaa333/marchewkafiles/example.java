package io.github.marchewaaa333.marchewkafiles;

import java.io.IOException;

import io.github.marchewaaa333.marchewkafiles.methods.DownloadFile;
import io.github.marchewaaa333.marchewkafiles.methods.GetContext;
import io.github.marchewaaa333.marchewkafiles.methods.GetFileInfo;
import io.github.marchewaaa333.marchewkafiles.methods.Save;
import io.github.marchewaaa333.marchewkafiles.methods.Writer;

public class example {
	
	
	public static void main(String[] args) {
		Save.CreateFile(".", "test.txt");
		Writer.Write(".", "test.txt", "Es "+" To jest test zapisywania");
		GetContext.get(".", "test.txt");
		GetFileInfo.GetInfo(".", "test.txt");
		try {
			DownloadFile.Download("https://www.w3schools.com/w3css/w3css_templates.asp", "./test.trgf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
