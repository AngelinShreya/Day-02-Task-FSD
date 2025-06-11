package task.codejava;

import java.util.Scanner;

public class SplitWords {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter a sentence: ");
	        String sentence = sc.nextLine();
	        String[] words = sentence.split(" ");
	        for(int i=0;i<words.length;i++) {
	        	System.out.println(words[i]);
	        }
	       
		

	}

}