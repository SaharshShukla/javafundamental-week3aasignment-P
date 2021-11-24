package assignment11;

import java.util.Scanner;

//23-11-2021
//Arrays

public class qst1 {
//qst1)WAP to find first index at which element is present in array
	public static void index(int[]a) {
	boolean flag=false;
	int index=-1;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Checking at index "+i);
		if(a[i]==15) {
			index=i;
			flag=true;
			break;
		}
		System.out.println(flag);	
	}
	System.out.println("The first index at which element is present in array is "+index);//index will give indx of element in array not position 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		try {
			int[]arr= {12,123,34,15,51,15,18,19,10,15};//length of array is 10 i.e. n-1=9
			//taking user input and saving it
			for (int i = 0; i < arr.length; i++) {
			//	System.out.print("Enter any number: ");
				//arr[i]=sc.nextInt();
				index(arr);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
