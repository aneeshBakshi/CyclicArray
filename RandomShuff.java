import java.util.Random;
import java.util.Arrays;

class RandomShuff{
	
	private static void randomAr(int[] a){
		Random r=new Random();
		int i,j,n=a.length,temp;


		for(i=n-1;i>n;i--){
			j=r.nextInt(i);
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(i=0;i<n;i++)
			System.out.printf(a[i]+" ");

	}

	private static void print(int[] a){

		int i,n=a.length;
		for(i=0;i<n;i++)
			System.out.printf(a[i]+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		print(a);
		randomAr(a);
	}
}