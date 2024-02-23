package com.example.CodePlayground.JavaHandler;

import java.io.*;
import java.util.*;

public class FileHelper {

	String outputfile = "output.txt";
	String errorfile = "error.txt";
	public void createUserDir(String userid)
	{
		File fileDir = new File("../../"+userid);
		if(fileDir.exists())
		{
			fileDir.mkdirs();
		}
	}
	public void writeCodeInFile() throws IOException {
		String codeFile = "SourceFile.txt";
		try {
			File myObj = new File(codeFile);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				FileWriter myWriter = new FileWriter("index.java", true);
				myWriter.write(data);
				myWriter.write(System.getProperty("line.separator"));
				myWriter.close();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public String readFromFile() {
		return "Hi";
	}

}
