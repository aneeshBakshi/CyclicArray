import java.util.Arrays;

class SearchElement{
	
	private static int search(int[] a,int l,int h,int key){

		if(l>h)
			return -1;
		int mid=(l+h)/2;
		if(a[mid]==key)
			return mid+1;
		if(a[l]<=a[mid]){
			if(a[l]<=key && a[mid]>=key)
				return search(a,l,mid-1,key);
			return search(a,mid+1,h,key);

		}
		if(a[h]>=key && a[mid]<=key)
			return search(a,mid+1,h,key);
		return search(a,l,mid-1,key);
	}

	public static void main(String[] args){
		int a[]={5,6,1,2,3,4};
		int key=3;
		int res=search(a,0,a.length-1,key);
		if(res>0)
			System.out.println("The position of key is "+res);
		else
			System.out.println("key is not present");
	}
}