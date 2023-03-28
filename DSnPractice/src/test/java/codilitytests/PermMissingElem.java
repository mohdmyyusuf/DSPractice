package codilitytests;

import java.util.HashSet;

public class PermMissingElem {

	/*
	 * An Array A consisting of N elements Integer is given the array contains
	 * integers in the range [1....(N+1)] which means exactly one element is missing
	 */

	private int permMissingFinder(int[] A) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 1; i <= A.length + 1; i++) {
			hs.add(i);
		}
		for (int i = 0; i < A.length; i++) {
			hs.remove((Integer) A[i]);
		}
		return hs.iterator().next();
	}

	public static void main(String[] args) {

		PermMissingElem pm = new PermMissingElem();

		int res = pm.permMissingFinder(new int[] { 2, 3, 1, 5 });
		System.out.println(res);
	}

}
