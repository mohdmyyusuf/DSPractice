package trickyquestions;

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
	
	
	
	
	
	public static void main(String[] args) {
		
		TQTwo_printnumwithoutloops obj = new TQTwo_printnumwithoutloops();
		obj.printNum1(1, 100);
	
	}
	
	

}
