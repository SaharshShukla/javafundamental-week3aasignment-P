package assignment11;

import java.util.Scanner;

/*23-11-2021
Arrays
*/
public class qst4 {
//qst4)WAP to convert binary number to decimal
public static int binary_To_Decimal(int num) {
	int deci_Num=0;//decimal number to initialize we gave zero
	int temp=num;
	int pow_Of_Two=0;//2^0+2^1..so on
	while(temp>0) {
		int remender=temp%10;//geting remender so module by 10
		temp=temp/10;//getting questiont so divide by 10
		deci_Num=deci_Num+remender*(int)Math.pow(2,pow_Of_Two++);
				//2^0+2^1..so on. 
	}
	return(deci_Num);
	
}
static void main(String[] args) {
		// TODO Auto-generated method stub
	//qst4)WAP to convert binary number to decimal
Scanner sc=new Scanner(System.in);
System.out.print("Enter any binary number: ");
int n=sc.nextInt();
int display=binary_To_Decimal(n);
System.out.println("Decimal equivalent of binary "+n+" is "+display);
	}

}
