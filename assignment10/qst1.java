package assignment10;

import java.util.Scanner;

/*22-11-2021
Arrays*/
public class qst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst1)make an array with user inputs of size 10. , then find sum of all elements in array
		Scanner sc=new Scanner(System.in);
	try {
		
		int[]a=new int[10];
		int sum=0;
		//enter first array:-a
		for ( int i = 0; i < a.length; i++) {
			System.out.print("Enter values for array1: ");
			a[i]=sc.nextInt();
			System.out.println("Current Index is "+i);
			sum=sum+a[i];
		}
		System.out.println("sum of array is: "+sum);
		
				
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
				
	}

}
