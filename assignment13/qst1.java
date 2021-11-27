package assignment13;

import java.util.Scanner;

//25-11-2021
//2D Arrays
public class qst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst1)add two 2D matrices to get the result matrix
		Scanner sc=new Scanner(System.in);
		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		int[][] mat3=new int[3][3];
		int row=mat1.length;
		int cols=mat1[0].length;
		//taking user input for matrix one
		System.out.print("enter elements of matrix 1: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		
		//displaying  matrix1
		System.out.println("displaying  matrix1 elements" );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print( mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		//taking user input for matrix two
				System.out.print("enter elements of matrix 2: ");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						mat2[i][j]=sc.nextInt();
					}
				}
		
				//displaying  matrix1
				System.out.println("displaying  matrix2 elements" );
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print( mat2[i][j]+" ");
					}
					System.out.println();
				}
				
				if(row!=cols) {
					System.out.println("Matrix is should be rows equal to colums ");
				}else {}
				//adding  matrix 
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						if(row!=cols) {
							System.out.println("Matrix is should be rows equal to colums ");
							break;
						}else {
							mat3[i][j]=mat1[i][j]+mat2[i][j];
						}
						
					}
					if(row!=cols) {
						break;}
				}
		
				//displaying addition of two matrix
				System.out.println("displaying  addition of matrix " );
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print( mat3[i][j]+" ");
					}
					System.out.println();
				}
		
		
		
	}

}


