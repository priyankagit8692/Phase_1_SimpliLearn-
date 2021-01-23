package com.simplilearn.Phase1_Assessment;

import java.io.File;
import java.util.Scanner;

public class SearchFile extends FileOperation {
	String rootDirectory = "D:\\Files";
	Scanner scanner = new Scanner(System.in);
	
	public SearchFile(String operation) {
		super(operation);
		
	}

	@Override
	void fileOperation() {
		File directory = new File(rootDirectory);
		String[] fileList = directory.list();
		int flag = 0;
		System.out.println("Enter the File name you want to search:");
		String inputFileName = scanner.next();
		if(fileList == null)
			System.out.println("File Not Found");
		else {
			for(int i =0; i < fileList.length; i++) {
				if(fileList[i].equals(inputFileName)) {
					System.out.println(inputFileName+" File Found");
					flag = 1;
				}
			}
		}
		if(flag == 0) {
			System.out.println("File Not Found");
		}
		
	}

	
}
