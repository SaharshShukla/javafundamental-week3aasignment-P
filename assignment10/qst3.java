package assignment10;

import java.util.Scanner;

public class qst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//qst3)make an array with user inputs of size 10. then print all positive numbers in an array"*/

		Scanner sc=new Scanner(System.in);
		try {
			int []a=new int[10];
			//taking user input and saving it
			int i;
			boolean flag=false;
			//taking  user input
			for( i=0;i<a.length;i++) {
				System.out.print("Enter an integer: ");
				a[i]=sc.nextInt();
				System.out.println("Index is "+i);
				}
				
			// checking condition and displaying it 
			for ( i = 0; i < a.length; i++) {
				//inside loop using if condition
				System.out.println("Checking condition at index "+i);
				if(a[i]>0) {//if number greater than zero
					flag=true;//if condition is true
					//break;//we want to check condition till last so no need of break in if part
				}else{
					System.out.println("negative number found checking breaks");
					break;//if condition become false we will come out of it and not check till last
				}
				
				System.out.println(flag);
				System.out.println("all positve elements in array is "+a[i]+" at index "+i);
			}
				
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
