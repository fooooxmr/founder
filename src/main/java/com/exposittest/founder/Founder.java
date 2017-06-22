package com.exposittest.founder;

import java.util.ArrayList;

public class Founder {
	
	private String inputFileName;
	private String outputFileName;
	private String foundStr;

	ArrayList<ArrayList<String>> lines;

	Founder(String[] arguments) {
		String[] buffer;
		Checker checker = new Checker(arguments);
		if((buffer = checker.check())!=null){
			inputFileName = buffer[0];
			foundStr = buffer[1];
			outputFileName = buffer[2];
		}else{
			System.out.println("Incorrect arguments");
			System.exit(1);
		}
	}

	public void found() {
		
		InputFile inputFile = new CsvInputFile(inputFileName);

		if ((lines = inputFile.getColumns()) != null) {
			ColumnFounder columnFounder = new ColumnFounder(lines);

			ArrayList<ArrayList<String>> foundColumn;

			if (!(foundColumn = columnFounder.found(foundStr)).isEmpty()) {

				WriteFile writeFile = new WriteFile();
				writeFile.write(foundColumn, outputFileName);

				System.out.println("Found success. File save as "+outputFileName);

			} else {
				System.out.println("Not found");
			}
		} else {
			System.out.println("Incorrect file");
		}

	}

}
