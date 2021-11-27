package assignment12;
//function side
import java.util.Scanner;

/*24-11-2021
String*/
public class qst1 {
//qst1)write a program to search a word inside a string?
	public static void search_A_Word(String str) {
		int index=str.indexOf("Hello");//show index of hello
		if(index==-1) {//array start at 0
			System.out.println("Word not found");
		}
		else {
			System.out.println("Word is found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst1)write a program to search a word inside a string?
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter any sentence: ");
		String s="Hello world";//sc.nextLine();
		search_A_Word(s);
	}

}



