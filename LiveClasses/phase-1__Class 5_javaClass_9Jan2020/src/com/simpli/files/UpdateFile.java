package com.simpli.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UpdateFile {
	
	private void modify(String filePath,String oldString,String newString) {
		
		try {
			List<String> newList = new ArrayList<String>();
			List<String> list = Files.readAllLines(Paths.get(filePath));
			for(String eline:list) {
				String modifiesLine = eline.replaceAll(oldString, newString);
				newList.add(modifiesLine);
			}
			Files.write(Paths.get(filePath), newList,StandardCharsets.UTF_8);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Modified");
	}
	public static void main(String[] args) {
		UpdateFile updateFile = new UpdateFile();
		updateFile.modify("D:\\Folder\\test2.txt", "2020", "2021");
		
	}

}
