package com.simpli.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadFile {
	
	private List<String> read(){
		List<String> lines = Collections.EMPTY_LIST;
		try {
			Path path = Paths.get("D:\\Folder\\test4.txt");
			lines = Files.readAllLines(path,StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lines;
	}
	
	private List<String> readContent(){
		List<String> lines = Collections.EMPTY_LIST;
		try {
			Path path = Paths.get("D:\\Folder\\test4.txt");
			lines = Files.readAllLines(path,StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lines;
	}
	
	private static void readFiles() {
		File file = new File("D:\\Folder\\");
		File[] files = file.listFiles();
		System.out.println("No of files:"+files.length);
		for(File each : files) {
			System.out.println(each.getName());
		}
	}
	
	private static void readFilesFolder() {
		File file = new File("D:\\Folder\\");
		File[] files = file.listFiles();
		System.out.println("No of files:"+files.length);
		for(File eachFile : files) {
			if(eachFile.isDirectory()) {
				File[] folderFiles = eachFile.listFiles();
				for(File f1:folderFiles) {
					System.out.println(f1.getName());
				}
			}
			else {
				System.out.println(eachFile.getName());
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile readObject = new ReadFile();
		List<String> lines = readObject.read();
		for(String line : lines) {
			System.out.println(line);
		}
		System.out.println("******************************");
		readFiles();
		System.out.println("******************************");
		readFilesFolder();

	}

}
