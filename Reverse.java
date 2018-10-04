import java.util.Arrays;

class Reverse{
	
	private static void reverse(int[] a){

		int i,n=a.length,temp;

		for(i=0;i<n/2;i++){
			temp=a[n-i-1];
			a[n-i-1]=a[i];
			a[i]=temp;
		}
	}

	private static void print(int[] a){

		int i,n=a.length;
		System.out.println("Array is");

		for(i=0;i<n;i++)
			System.out.printf(a[i]+" ");

		System.out.println();
	}

	public static void main(String[] args){

		int a[]={1,2,3,4,5};
		print(a);
		reverse(a);
		print(a);
	}
}