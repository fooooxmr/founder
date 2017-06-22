package com.exposittest.founder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CsvInputFile implements InputFile{
	
	private String fileName;
	private ArrayList<ArrayList<String>> lines;
	
	public CsvInputFile(String name) {
		fileName = name;
		lines = new ArrayList<ArrayList<String>>();
	}
	
	public ArrayList<ArrayList<String>> getColumns(){
		
		String[] buffer;
		
		try {

			if(getType(fileName).equalsIgnoreCase(".csv")){
			
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			while (reader.ready()) {
				
				buffer = reader.readLine().split(",");
				
				for(int i = 0; i<buffer.length;i++){
					if(lines.size()<=i){
						lines.add(new ArrayList<String>());
					}
					
					lines.get(i).add(buffer[i]);
				}
			}
			reader.close();
			return lines;
			}
			else{
				System.out.println("Incorrect input file format");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}
	
	private String getType(String fileName) {
		int index = fileName.lastIndexOf('.');
		return index == -1 ? null : fileName.substring(index);
	}

}
