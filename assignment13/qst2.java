package assignment13;

import java.util.Scanner;

//25-11-2021
//2D Arrays
public class qst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst2)Print the matrix column wise"
		Scanner sc=new Scanner(System.in);
		int[][] mat=new int[3][3];
		int row=mat.length;
		int cols=mat[0].length;
		//taking user input for matrix 
		System.out.print("enter elements of matrix 1: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		//displaying  matrix columns wise
		System.out.println("displaying  matrix elements columns wise" );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print( mat[j][i]+" ");//to print column wise
			}
System.out.println();
		}
		
		
	}

}
