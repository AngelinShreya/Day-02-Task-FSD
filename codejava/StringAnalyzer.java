package task.codejava;

import java.util.Scanner;

public class StringAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		//word count
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
		//System.out.println(words[i]);
		if(words[i].isEmpty()) {
			System.out.println("Word count=0");
		}
		}
		System.out.println("word count="+words.length);
		 
		//charecter count
		
		//int cc= str.length();
		//System.out.println("Charecter Count:"+cc);
	    
		int cc=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				cc++;
			}
		}
		System.out.println("Charecter Count:"+cc);
		
		//string reverse
		System.out.print("String reverse:");
		for(int i = words.length - 1; i >= 0; i--) {
			//String[] rev =sc.nextLine();
			
		System.out.print(words[i]+" ");
		}
		System.out.println();

		//Longestword
				String Longestword=" ";
				for(int i=0;i<words.length;i++) {
				if(words[i].length()>Longestword.length()) {
					Longestword=words[i];
				}
				}
				System.out.println(Longestword);

	}

}
