package com.simpli.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	private static void delete(String filePath) {
		Path path = Paths.get(filePath);
		try {
			Files.delete(path);
			System.out.println("file deleted");
		} 
		catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			System.out.println("There is no such file");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete("D:\\Folder\\test.txt");

	}

}
