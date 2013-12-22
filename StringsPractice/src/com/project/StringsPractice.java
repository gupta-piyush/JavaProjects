package com.project;

public class StringsPractice {
	// To print a statement before main!
	static {
		System.out.println("Welcome to UF!! ");
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		// String a = "abcbbdfhbb";
		// String b = "bbe";
		String a = "abcabcdababcdabcdabde";
		String b = "abcdabd";
		System.out.println("Result: " + isSubstring(a, b));
	}

	static boolean isSubstring(String a, String b) {
		if (b.length() > a.length())
			return false;
		char[] newa = a.toCharArray();
		char[] newb = b.toCharArray();
		int index = 0, nextIndex = 0, count = 0, j = 0;
		while (index < a.length()) {
			System.out.println("Characters are: " + newa[index] + " & "
					+ newb[j]);
			if ((newa[index] == newb[0]) && j != 0) {
				if (count < 1) {
					count++;
					nextIndex = index;
				}
			}
			//No match: reset the values
			if (newa[index] != newb[j]) {
				index++;
				if (count < 1)
					nextIndex++;
				// resetting to start from next possible match
				j = 0;
				index = nextIndex;
				count = 0;
			} 
			// Match of character. Move to next
			else {	
				if (count < 1)
					nextIndex++;
				index++;
				j++;
				if (j == (b.length()))
					return true;
			}
		}
		return false;
	}
}
