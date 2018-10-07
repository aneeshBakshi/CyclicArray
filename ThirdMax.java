import java.util.Arrays;

class ThirdMax{
	
	private static int thirdMax(int[] a){

		int i,n=a.length;
		int maxA=-10000,maxB=-10000,maxC=-10000;
		for(i=0;i<n;i++){
			if(a[i]>maxA){
				maxC=maxB;
				maxB=maxA;
				maxA=a[i];
			}
			else if(a[i]>maxB){
				maxC=maxB;
				maxB=a[i];
			}
			else if(a[i]>maxC)
				maxC=a[i];
		}
		return maxC;
	}

	private static void print(int[] a){
		for(int ar: a)
			System.out.printf(ar+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={3,6,2,5,99,77,55};
		print(a);
		System.out.println(thirdMax(a));
	}
}