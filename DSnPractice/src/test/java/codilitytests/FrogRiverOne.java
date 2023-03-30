package codilitytests;

import java.util.HashSet;

public class FrogRiverOne {
	
	
	private int frogRiverOneCalc(int X, int[] A) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 1; i <= X; i++) {
			hs.add(i);
		} 
		
		for (int i = 0; i < A.length; i++) {
			if(hs.remove(A[i])) {
				if(hs.isEmpty()) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		FrogRiverOne fr = new FrogRiverOne();
		int res = fr.frogRiverOneCalc(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4});
		System.out.println(res);
	}

	

}
