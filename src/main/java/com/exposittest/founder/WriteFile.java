package com.exposittest.founder;

import java.util.ArrayList;

public class WriteFile {
	
	public void write(ArrayList<ArrayList<String>> lines,String fileName){
		
		OutputFile outputFile = null;
		
		if(getType(fileName).equalsIgnoreCase(".csv")){
			outputFile = new CsvOutputFile(lines);
		}else
		if(getType(fileName).equalsIgnoreCase(".txt")){
			outputFile = new TxtOutputFile(lines);
		}else{
			System.out.println("Incorrect output file format");
			System.exit(1);
		}
		outputFile.write(fileName);
		
	}
	
		
	private String getType(String fileName) {
		int index = fileName.lastIndexOf('.');
		return index == -1 ? null : fileName.substring(index);
	}

}
