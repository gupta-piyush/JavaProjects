package com.project;

public class StringsPractice {
	static 
	{
		System.out.print("Welcome to UF!! ");
	}
	
	public static void main(String[] args){
		System.out.println("Hello World");
		//String a = "abcbbdfhbb";
		//String b = "bbe";
		String a = "abcabcdababcdabcdabde";
		String b = "abcdabd";
		System.out.println("Result: "+isSubstring(a,b));
	}
	
	static boolean isSubstring(String a, String b){
		if(b.length()>a.length())
			return false;
		//Adding a new line to test for commits.
		
		char[] newa = a.toCharArray();
		char[] newb = b.toCharArray();
		int index=0, nextIndex=0, count = 0,j=0;
		while(index<a.length()){
			//for(int j=0;j<b.length();j++){
				System.out.println("Characters are: "+newa[index]+" & "+ newb[j] );
				if((newa[index]==newb[0]) && j!=0){
					if(count<1){
						count++;
						nextIndex=index;
					}
				}
				if(newa[index]!=newb[j]){
					index++;
					if(count<1)
						nextIndex++;
					//break;
					j=0;
					index=nextIndex;
					count=0;
				}
				else{
					if(count<1)
						nextIndex++;
					index++;
					j++;
					if(j==(b.length()))
						return true;
				}
				
			//}
		}
		return false;
	}
}
