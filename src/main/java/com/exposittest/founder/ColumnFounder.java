package com.exposittest.founder;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColumnFounder {
	
	private ArrayList<ArrayList<String>> columns;
	private ArrayList<ArrayList<String>> foundColumns;
	
	ColumnFounder(ArrayList<ArrayList<String>> lines){
		columns = lines;
		foundColumns = new ArrayList<ArrayList<String>>();
	}

	public ArrayList<ArrayList<String>> found(String foundStr){
		for (ArrayList<String> column : columns) {
			for (String word : column) {
				if(regularCheck(word,foundStr)){
					foundColumns.add(column);
					break;
				}
			}
		}
		return foundColumns;
	}
	
	 public  boolean regularCheck(String word,String foundStr){  
	        Pattern p = Pattern.compile(foundStr);  
	        Matcher m = p.matcher(word);  
	        return m.matches();  
	} 
}
