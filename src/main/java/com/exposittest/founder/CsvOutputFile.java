package com.exposittest.founder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvOutputFile implements OutputFile {

	private ArrayList<ArrayList<String>> columns;

	CsvOutputFile(ArrayList<ArrayList<String>> lines) {
		columns = lines;
	}

	public void write(String fileName) {

		String buffer;
		try {
			FileWriter writer = new FileWriter(fileName);

			for (ArrayList<String> column : columns) {
				buffer = column.toString();
				buffer = buffer.replaceAll(" ","");
				buffer = buffer.substring(1, buffer.length()-1);
				buffer = buffer.concat("\r\n");
				writer.write(buffer);
			}
			writer.close();
		} catch (IOException ex) {
			System.out.println("Writing file error");
			System.out.println(ex.getMessage());
		}

	}
}
