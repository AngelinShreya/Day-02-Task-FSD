package task.codejava;

import java.util.Scanner;

public class VoewlsConsonants {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = in.nextLine();
		String string=str.toLowerCase();
		int vowels=0,consonant=0;
		for(int i=0;i<string.length();i++) {
			char ch = string.charAt(i);
			if("aeiou".contains(string.valueOf(ch))) {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("consonant:"+consonant);
	}

}
