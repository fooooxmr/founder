package com.exposittest.founder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TxtOutputFile implements OutputFile {
	private ArrayList<ArrayList<String>> columns;

	TxtOutputFile(ArrayList<ArrayList<String>> lines) {
		columns = lines;
	}

	public void write(String fileName) {

		try {
			FileWriter writer = new FileWriter(fileName);

			for (ArrayList<String> column : columns) {
				for (String word : column) {
					writer.write(word.concat("\r\n"));
				}
			}
			writer.close();
		} catch (IOException ex) {
			System.out.println("Writing file error");
			System.out.println(ex.getMessage());
		}

	}

}
