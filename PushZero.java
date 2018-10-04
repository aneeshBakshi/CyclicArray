import java.util.Arrays;

class PushZero{
	
	private static void pushZero(int a[]){

		int n=a.length,i,count=0;

		//assign all non zero elements to the left
		for(i=0;i<n;i++)
			if(a[i]!=0)
				a[count++]=a[i];

		//assign zero in the remaining spaces
		while(count<n)	
			a[count++]=0;		
	}

	//method to print array
	private static void print(int[] a){
		int i,n=a.length;
		System.out.println("Array is");
		for(i=0;i<n;i++)
			System.out.printf(a[i]+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={1,2,0,0,0,5,0,6,0};
		print(a);
		pushZero(a);
		print(a);
	}

}