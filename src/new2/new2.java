package new2;

public class new2{
	public static void main(String[] args) {
		int[] arr = {10,12,500,19,30,600};
		int i;
		int max = 0;
		for(i=0 ; i<arr.length ; i++) {
			
			if(arr[i]> max) {
				
				max = arr[i];
				
			}
			
		}
		System.out.println("the largest no. of the arr is  = "+ max);
	}
}