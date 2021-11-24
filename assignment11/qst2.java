package assignment11;
/*23-11-2021
Arrays*/
public class qst2 {
	//qst2)WAP to find last index at which element is present in array
public static void last_Index(int[] a) {
	int index=-1;
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		System.out.println("Checking the condition at index "+i);
		if(a[i]==15) {
			flag=true;
			index=i;//here we have not use break becoz we want to check condition till end
		}
		System.out.println(flag);
	}
	System.out.println("The last index at which element is present in array is "+index);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//qst2)WAP to find last index at which element is present in array
		
		try {
			int[]arr= {12,123,34,15,51,15,18,19,10,15};//length of array is 10 i.e. n-1=9
			//taking user input and saving it
			for (int i = 0; i < arr.length; i++) {
			//	System.out.print("Enter any number: ");
				//arr[i]=sc.nextInt();
				last_Index(arr);//sending whole array in method last_Index
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
