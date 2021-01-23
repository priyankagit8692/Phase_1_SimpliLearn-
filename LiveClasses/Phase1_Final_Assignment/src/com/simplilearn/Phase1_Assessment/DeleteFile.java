package com.simplilearn.Phase1_Assessment;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFile extends FileOperation {

	String rootDirectory = "D:\\Files";
	Scanner scanner = new Scanner(System.in);

	public DeleteFile(String operation) {
		super(operation);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fileOperation() {
		System.out.println("Enter the name of file you want to delete: ");
		String inputFileName = scanner.next();
		File directory = new File(rootDirectory);
		File[] fileList = directory.listFiles();
		if (fileList == null) {
			System.out.println("Empty directory");
		} 
		
		int flag = 0;
		for (int i = 0; i < fileList.length; i++) {
			File fileName = fileList[i];
			if(!fileName.isDirectory()) {
				if(fileName.getName().equals(inputFileName)) {
					flag = 1;
					String newRootDirectory = rootDirectory + "//" + inputFileName;
					Path path = Paths.get(newRootDirectory);

					try {
						Files.delete(path);
						System.out.println("File deleted");
					}
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		if(flag == 0) {
			System.out.println("There is no such file in the directory");
		}
	}
}
