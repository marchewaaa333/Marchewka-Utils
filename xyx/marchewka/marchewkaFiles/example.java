package xyx.marchewka.marchewkaFiles;

import xyx.marchewka.marchewkaFiles.methods.GetContext;
import xyx.marchewka.marchewkaFiles.methods.GetFileInfo;
import xyx.marchewka.marchewkaFiles.methods.Save;
import xyx.marchewka.marchewkaFiles.methods.Writer;

public class example {
	
	
	public static void main(String[] args) {
		Save.CreateFile(".", "test.txt");
		Writer.Write(".", "test.txt", "Es "+" To jest test zapisywania");
		GetContext.get(".", "test.txt");
		GetFileInfo.GetInfo(".", "test.txt");
	}

}
