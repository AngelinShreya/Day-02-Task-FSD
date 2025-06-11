package task.codejava;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int num = sc.nextInt();
		 
		int[] arr = new int[num];
		System.out.println("Enter "+num+" Elements");
		for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Reverse Order");
		for(int i=num-1;i>=0;i--) {
			System.out.println(arr[i]);
			}
    sc.close();
	}

}
