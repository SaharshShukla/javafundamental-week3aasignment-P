package assignment12;

import java.util.Scanner;

/*24-11-2021
String
*/
public class qst3 {
//qst3)write a program to reverse a sentense
	public static void reverse(String str) {
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst3)write a program to reverse a sentense
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string: ");
		String s=sc.nextLine();
		reverse(s);
	}

}
