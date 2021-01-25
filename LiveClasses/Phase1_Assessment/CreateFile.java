package com.simplilearn.Phase1_Assessment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile extends FileOperation {
	String rootDirectory = "D:\\Files";
	Scanner scanner = new Scanner(System.in);
	public CreateFile(String fileOperation) {
		super(fileOperation);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fileOperation() {
		System.out.println("Enter the file name you want to create: ");
		String inputFileName = scanner.next();
		File file = new File(rootDirectory, inputFileName);
		FileWriter fileWriter = null;
		try {
			if (file.createNewFile()) {
				System.out.println("Files created");
				fileWriter = new FileWriter(file);
				fileWriter.write("Created new file");
			}
			else {
				System.out.println("file already exists");
				fileWriter = new FileWriter(file);
				fileWriter.write("Already there a new file");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
