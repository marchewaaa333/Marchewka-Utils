# Marchewka-Utils
- Simple utils (web, files)
- Version b1.0

## General info
This project is a simple utils.
	
## Technologies
Project is created with:
* Java: 8
	
## Setup
To use it:
```
1. Download builded version
2. Go to Build path
3. Click Libraries
4. Add external jars
5. Select MarchewkaFilesV-B1.jar
6. You are done ;0
```
## Example usage of files: 
```
import xyx.marchewka.marchewkaFiles.methods.GetContext;
import xyx.marchewka.marchewkaFiles.methods.GetFileInfo;
import xyx.marchewka.marchewkaFiles.methods.Save;
import xyx.marchewka.marchewkaFiles.methods.Writer;

public class example {
	
	public static void main(String[] args) {
		Save.CreateFile(".", "test.txt");
		Writer.Write(".", "test.txt", "This is example context!");
		GetContext.get(".", "test.txt");
		GetFileInfo.GetInfo(".", "test.txt");
	}

}

```
