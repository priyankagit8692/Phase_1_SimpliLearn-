package com.simpli.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
	private static void createUsingFileClass()  {
		String rootDirectoy = "D:\\Folder\\";
		
		//Create file instance
		File file = new File(rootDirectoy,"yetAnotherFile.png");
		FileWriter fileWriter = null;
		try {
			if(file.createNewFile()) {
				System.out.println("Files created");
			}
			else {
				System.out.println("file already exists");
				 fileWriter = new FileWriter(file);
				fileWriter.write("test data 1");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void createUsingFOS() {
		String data = "test data";
		FileOutputStream out  = null;
		try {
			out = new FileOutputStream("D:\\Folder\\test2.txt");
			out.write(data.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void createUsingNIO() {
		Path path = Paths.get("D:\\Folder\\test4.txt");
		String data = "Using NIO methods";
		List<String> strings = Arrays.asList("1st line","2nd line");
		try {
			//Files.write(path, data.getBytes());
			Files.write(path, strings,StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUsingFileClass();
		//createUsingFOS();
		//createUsingNIO();
	}

}
