import java.util.Arrays;

class CyclicRotation{

	private static void rotateArray(int[] ar,int c){
		int i=0,curIndex=0,newIndex=0,backVal=ar[curIndex],curVal=ar[curIndex];
		int n=ar.length;
		while(i<n){
			//Store previous new index in current index 
			curIndex=newIndex;
			//compute new index
			newIndex=(curIndex+c)%n;
			//store value in new index in backVal
			backVal=ar[newIndex];
			//store curVal in position of new index
			ar[newIndex]=curVal;
			//store backVal in carVal
			curVal=backVal;
			i++;
		}
	}

	private static void print(int[] a){
		System.out.println("\nThe array is");
		for(int i=0;i<a.length;i++)
		System.out.printf(a[i]+ " ");
	}

	//driver code
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		print(a);
		rotateArray(a,3);
		print(a);
	}
}