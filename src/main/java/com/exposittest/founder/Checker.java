package com.exposittest.founder;

public class Checker {

	private String[] args;
	private String in;
	private String q;
	private String o;

	private boolean flagI = false;
	private boolean flagQ = false;
	private boolean flagO = false;

	Checker(String[] arguments) {
		args = arguments;
	}

	// check arguments
	public String[] check() {
		if (args.length == 6) {
			for (int i = 0; i < args.length - 1; i++) {

				if (args[i].equals("-i")) {
					if (!flagI) {
						flagI = true;
						in = args[i + 1];
					} else {
						return null;
					}
				}

				if (args[i].equals("-q")) {

					if (!flagQ) {
						flagQ = true;
						q = args[i + 1];

					} else {
						return null;
					}
				}

				if (args[i].equals("-o")) {
					if (!flagO) {
						flagO = true;
						o = args[i + 1];
					} else {
						return null;
					}
				}
			}

		} else {
			return null;
		}

		if ((!flagI) || (!flagQ) || (!flagO)) {
			return null;
		}

		String[] answer = new String[3];
		answer[0] = in;
		answer[1] = q;
		answer[2] = o;

		return answer;
	}

}
