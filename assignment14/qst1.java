package assignment14;

import java.util.Scanner;

//26-11-2021
//2D Arrays practice
public class qst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst1)"-lower triangular matrix
		//getting lower number in matrix
		/*   i/p                    o/p
		 *  -      -                -      -
		 * |1  2  3|            |1  0  0|
		 * |4  5  6|            |4  5  0|
		 * |7  8  9|            |7  8  9|
		 *  -       -
		 * 
		 * 
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		int row=matrix.length;
		int cols=matrix[0].length;
		
		System.out.println("Enter elements in matrix");
		//taking user input for matrix
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			matrix[i][j]=sc.nextInt();			
		}
	}
	
	if(row!=cols) {
		System.out.println("Matrix should be square matrix");
	}else {
		System.out.println("\"Displaying user input for matrix\"");
		//Dispalying user input for matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]+" ");			
			}
			System.out.println();
		}
	}
	
	System.out.println("\"Displaying lower triangular matrix\"");
	//Displaying lower triangular matrix
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			if(j>i) {//condition for lower triangular matrix
				System.out.print("0 ");
			}else {
				System.out.print(matrix[i][j]+" ");
			}
						
		}
		System.out.println();
	}
	
	
	
	
	
	}

}









