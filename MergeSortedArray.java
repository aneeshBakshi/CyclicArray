import java.util.Arrays;


class MergeSortedArray{
	
	private static void merge(int[] a,int[] b,int[] c){

		int i=0,j=0,k=0;
		int n1=a.length,n2=b.length;

		while(i<n1 && j<n2){

			if(a[i]<=b[j])
				c[k++]=a[i++];
			else if(b[j]<a[i])
				c[k++]=b[j++];
		}

		while(i<n1)
			c[k++]=a[i++];

		while(j<n2)
			c[k++]=b[j++];
	}

	private static void print(int[] a){

		int i,n=a.length;
		System.out.println("Array is");
		for(i=0;i<n;i++)
			System.out.printf(a[i]+" ");
		System.out.println();
	}

	public static void main(String[] args){

		int a[]={1,2,3,4,5,6};
		int b[]={7,8,9};
		int[] c= new int[a.length+b.length];

		print(a);
		print(b);
		merge(a,b,c);
		print(c);
	}
}