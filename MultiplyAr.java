import java.util.Arrays;

class MultiplyAr{

	private static void multiply(int[] a){

		int prev,cur,i=0,n=a.length;
		prev=a[0];

		for(i=0;i<n-1;i++){
			//current value
			cur=a[i];
			//find a[i]
			a[i]=prev*a[i+1];
			//assign current value to previous
			prev=cur;
		}
		a[i]=prev*a[i];
	}

	//print array method
	private static void print(int[] a){
		int n=a.length;
		System.out.println("Array is");
		for(int i=0;i<n;i++)
		System.out.printf(a[i]+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		print(a);
		multiply(a);
		print(a);
	}
}