package trickyquestions;

public class TQOne {

	public void printOneToHundred() {
		int one = 'a'/'a'; 
		String s = "..........";
		for (int i = one; i <= (s.length()*s.length()); i++) {
			System.out.print(i);
		}
	}
		
	public void printOneToHundred2() {
		
		//ASCII of d is 100
		int one = 'a'/'a'; 
		
		for (int i = one; i <='d'; i++) {
			System.out.println(i);
		}
		
	}
	
		
	public static void main(String[] args) {
		
		TQOne ob = new TQOne();
		ob.printOneToHundred2();
	}
}
