package assignment11;
/*23-11-2021
Arrays*/
public class qst3 {
	//qst3)WAP to find difference in 2 arrays
	
public static int[] diff(int[] a,int[]b) {
	int c[]=new int[5];
	for (int i = 0; i < b.length; i++) {
		c[i]=a[i]-b[i];
	}
	return(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst3)WAP to find difference in 2 arrays 
		try {
			//taking 5 element in an array
			int[] a= {11,112,103,114,150};
			int[] b= {1,2,3,4,5};
			int [] rslt=new int[5];
			for(int i=0;i<rslt.length;i++) {
				rslt=diff(a, b);
				System.out.println("difference between two arrays is "+rslt[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
