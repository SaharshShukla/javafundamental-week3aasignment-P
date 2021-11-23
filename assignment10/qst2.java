package assignment10;

import java.util.Scanner;

public class qst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst2)make an array with user inputs of size 10. , then find midle element in an array
		Scanner sc=new Scanner(System.in);
		try {
			int []a=new int[10];
			//taking user input
			for(int i=0;i<a.length;i++) {
				System.out.print("Enter an integer: ");
				a[i]=sc.nextInt();
				System.out.println("Index is "+i);
				
				//inside loop using if condition
				System.out.println("Checking at index "+i);
				if(i==5) {//if index =5
					System.out.println("The middle element is "+a[i]);
					break;//to check till middle only
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
