package codilitytests;

public class TapEquilibrium {
/*Any integer p such that 0 < p < N splits this tape into two non empty parts A[0], A[1].... A[p-1]
and A[p], A[p+1]A[p+2]...A[N-1] the difference between two parts is the value of ()A[0], A[1].... A[p-1]) - A[p], A[p+1]A[p+2]...A[N-1]
in other words the absolute difference between first part and second part*/	
	private int tapEquiChecker(int[] A) {
		
		int rightNum = 0;
		for (int i = 0; i < A.length; i++) {
			rightNum = rightNum + A[i]; 
		}
		System.out.println("Added all elements of array to rightNum >>> " +rightNum);
		int mindiff = Integer.MAX_VALUE;
		//System.out.println(mindiff);
		
		int leftNum = 0;
		for (int i = 0; i < A.length - 1; i++) {
			rightNum = rightNum-A[i];
			System.out.println("Subtracted" +i+ "th elements of array from rightNum >>> " +rightNum);

			leftNum = leftNum+A[i];

			System.out.println("Added" +i+ "th elements of array from leftnum >>> " +leftNum);
				if(Math.abs(leftNum - rightNum)<mindiff) {
					mindiff = Math.abs(leftNum - rightNum);
					System.out.println("calculated min diff >> "+mindiff);
					
				}
			
			
		}return mindiff;
	}
		
	public static void main(String[] args) {
		TapEquilibrium te = new TapEquilibrium();
		int res = te.tapEquiChecker(new int [] {3, 1, 2, 4, 3});
		System.out.println(res);
	}


}
