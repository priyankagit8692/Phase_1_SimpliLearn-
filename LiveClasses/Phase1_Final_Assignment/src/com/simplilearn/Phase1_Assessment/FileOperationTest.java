package com.simplilearn.Phase1_Assessment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class FileOperationTest {
	static String rootDirectory = "D:\\Files";
	static Scanner scanner = new Scanner(System.in);
	final static String DEVELOPER_NAME = "Priyanka Kumawat";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to File Handling Application by :"+DEVELOPER_NAME);
		FileOperation operation = null;
		int choice;
		try {
			while (true) {
				choice = showMenu(scanner);

				switch (choice) {
				case 1:
					fileNameAscending();
					break;
				case 2:
					char newChoice;
					newChoice = innerShowMenu(scanner);
					try {
						switch (newChoice) {
						case 'a':
							operation = new CreateFile("Create new File in the Directory");
							System.out.println(operation);
							operation.fileOperation();
							break;
							
						case 'b':
							operation = new DeleteFile("Delete a file from the directory");
							System.out.println(operation);
							operation.fileOperation();
							break;
							
						case 'c':
							operation = new SearchFile("Search any file in the Directory");
							System.out.println(operation);
							operation.fileOperation();
							break;
						
							
						default:
							System.out.println("---------Invalid Input!!---------");
							break;
						}
					} catch (InputMismatchException e) {
						scanner.close();
						System.out.println("-----Invalid Input-----");
						System.exit(0);
					}
					break;

				
				default:
					navigateOrExist();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("-----Invalid Input------");
		}

	}


	public static void navigateOrExist() {
		 
		scanner.close();
		System.out.println("--------------------------Application Terminated ----------------------------");
		System.exit(0);

	}
	public static void fileNameAscending() {
		File directory = new File(rootDirectory);
		List<String> newFileList = new ArrayList<>();
		File[] fileList = directory.listFiles();
		if(fileList.length == 0) {
			System.out.println("Directory is Empty!!");
		}else {
			
			for (File eachFile : fileList) {
				if (!eachFile.isDirectory()) {
					newFileList.add(eachFile.getName());
				}
			}
			Collections.sort(newFileList);
			System.out.println("File Names in the Directory in Ascending order: ");
			for (String listName : newFileList) {
				System.out.println(listName);
			}
		}
		

	}

	private static int showMenu(Scanner scanner) {
		System.out.println();
		System.out.println("Please enter an option:");
		System.out.println("1. Press 1 : To get the name of the files in Ascending Order");
		System.out.println("2. Press 2 : To perform Different File Operation ------------");
		System.out.println("3. Close the application");
		int choice = scanner.nextInt();
		return choice;
	}

	public static char innerShowMenu(Scanner scan) {
		System.out.println("   a. Press a : To create a file in the directory" + "\n"
				+ "   b. Press b : To delete a specific file from the directory" + "\n"
				+ "   c. Press c : To search a specific file in the directory" + "\n");
		char newChoice = scanner.next().charAt(0);
		return newChoice;
	}
}
