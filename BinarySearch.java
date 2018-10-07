import java.util.Arrays;

class BinarySearch{
	
	private static int search(int[] a,int l,int h,int key){
		if(h>=l){
			int mid=(l+h)/2;
			if(a[mid]==key)
				return mid;
			if(key<a[mid])
				return search(a,l,mid-1,key);
			else if(a[mid]<key)
				return search(a,mid+1,h,key);
		}
		return -1;
	}

	private static void print(int[] a){
		for(int ar:a)
			System.out.printf(ar+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int key=6;
		print(a);
		int res=search(a,0,a.length-1,key);
		if(res>=0)
			System.out.println("The position of "+key+" is "+(res+1));
		else
			System.out.println("Element is not present");
	}
}