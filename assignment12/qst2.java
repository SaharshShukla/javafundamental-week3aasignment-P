package assignment12;
//mot working
import java.util.Scanner;

/*24-11-2021
String
*/
public class qst2 {
	//qst2)write program to convert all th first char of a words in a sentense to uppercase
	
	public static String first_Char(String str) {
		str=" "+str;//to identify 1st letter with space i.e adding space before first letter 
		String rst="";//empty string
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);//searching word by index of i
			if(ch==' ') {//condition to cehck space
				rst=rst+ch;
				i++;//index will get incerse
				ch=str.charAt(i);
				rst=rst+Character.toUpperCase(ch);//if conditon is true than first letter become uppercase
			}else {
				rst=rst+ch;
			}
		}
		rst=rst.trim();//to remove extra spaces
		return(rst);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst2)write program to convert all th first char of a words in a sentense to uppercase
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any sentence: ");
		String s=sc.nextLine();
		String display=first_Char(s);
		System.out.println("First char of a word   is: "+display);
		
	}

}
