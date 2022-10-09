package trickyquestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TQTwo_printnumwithoutloops {
	
	public void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public void printNum1(int start, int end) {
		if(start<=end) {
			System.out.println(start);
			start++;
			printNum1(start, end);
		}
	}
	
	public void printNum2() {
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
	}
	
	
	
	
	public static void main(String[] args) {
		
		TQTwo_printnumwithoutloops obj = new TQTwo_printnumwithoutloops();
		//obj.printNum1(1, 100);
		obj.printNum2();
	
	}
	
	

}
