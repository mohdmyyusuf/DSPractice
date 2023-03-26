package codilitytests;

public class CyclicRotation {
	
	/*first of all check the length of array:
	// * if it is 0, return array 
	 * or if it is equal to number of rotations, return array
	 * then run a loop for number of rotations and under that loop another loop to iterate the
	 * array from second last element... 
	 */

	private int[] CyclicRotator(int[] ar, int n) {
		
		if(ar.length == 0 || ar.length == n ) {
			return ar;
		}

		for (int i = 0; i < n; i++) {
			int lastVal = ar[ar.length - 1];

			for (int j = ar.length - 2; j >= 0; j--) {
				ar[j + 1] = ar[j];
			}
			ar[0] = lastVal;
		}
		return ar;
	}

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();

		int a[] = cr.CyclicRotator(new int[] {4, 5, 6, 7}, 4);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
