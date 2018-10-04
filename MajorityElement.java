import java.util.HashMap;

class MajorityElement{
	private static void findMajority(int[] a){
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		int n=a.length;
		for(int i=0;i<n;i++){
			if(map.containsKey(a[i])){
				int count= map.get(a[i]) + 1;
				if(count>=n/2){
					System.out.println("Majority element is"+a[i]);
					return;
				}
				else
					map.put(a[i],count);
			}
			else
				map.put(a[i],1);
		}
		System.out.println("No majority element found");
	}
	public static void main(String[] args){
		int a[]={1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3};
		findMajority(a);
	}
}
