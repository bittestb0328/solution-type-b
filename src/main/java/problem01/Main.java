package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max < Math.abs(arr[i])) {
				max = arr[i];
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max < Math.abs(arr[i])) {
				max = arr[i];
				
			}
		}
		
		System.out.printf("[%d,%d]\n",min, max);
		
		
		
		
		
		
	}
	
}
