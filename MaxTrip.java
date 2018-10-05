import java.util.*;

class MaxTrip{
	
	private static int maxTrip(int[] a,int n){

		int i,max1=-10000,max2=-10000,max3=-10000;
		for(i=0;i<n;i++){
			if(a[i]>max1){
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2){
				max3=max2;
				max2=a[i];
			}
			else if(a[i]>max3)
				max3=a[i];
		}
		return(max3+max2+max1);
	}
	public static void main(String[] args){
		int a[]={9,1,5,3,7};
		int n=a.length;
		System.out.println("The maximum triplet sum is "+maxTrip(a,n));
	}
}