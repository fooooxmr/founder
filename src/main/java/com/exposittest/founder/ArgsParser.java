package com.exposittest.founder;

public class ArgsParser {

private String[] args;
	
	ArgsParser(String[] arguments){
		args = arguments;
	}
	
	public  String[] parse()  {
		String[] arguments;
		Checker checker = new Checker(args);
		
		if ((arguments = checker.check()) != null) {
			return arguments;
		} else {
			System.out.println("Incorrect arguments");
			System.exit(1);
		}

		return arguments;
	}
}
