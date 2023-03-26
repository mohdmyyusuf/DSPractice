package codilitytests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OddOneOccurance {

	private int OddOccuranceChecker(int[] ar) {
		HashSet<Integer> aList = new HashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			int a = ar[i];
			if (aList.contains(a)) {
				aList.remove(new Integer(a)); // Remove method of hashset works on indices or objects so object has been
												// added..
			} else {
				aList.add(a);
			}
		}
		return aList.iterator().next();
	}

	public static void main(String[] args) {
		OddOneOccurance oc = new OddOneOccurance();
		int res = oc.OddOccuranceChecker(new int[] { 9, 3, 9, 3, 9, 7, 9 });
		System.out.println(res);
	}

}
