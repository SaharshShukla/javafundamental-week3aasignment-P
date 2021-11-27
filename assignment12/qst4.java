package assignment12;
/*24-11-2021
String
*/
public class qst4 {
//qst4)check given string is palindrome or not
	public static void isPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println("Not a plindorme");
				break;
			}
			start++;
			end--;
		}
		System.out.println(str+" Is a plindorme");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst4)check given string is palindrome or not
		String s="madam";
		isPalindrome(s);
	}

}
