import java.util.Arrays;
import java.util.Collections;

class KthSmallest{
	
	private static int kthSmallest(int[] a,int k){
		Arrays.sort(a);
		return a[k-1];
	}

	private static void print(int[] a){
		System.out.println("Array is");
		for(int ar:a)
			System.out.printf(ar+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={2,6,4,3,5,1,7};
		int k=4;
		print(a);
		System.out.println("4th smallest element is"+kthSmallest(a,k));

	}
}