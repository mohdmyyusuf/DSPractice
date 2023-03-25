package trickyquestions;

import java.io.Console;

public class ReadingPasswordFC {
	/*
	 * Reading password from console
	 */
	
	public static void passwordReader(){
		
		Console console =  System.console();
		
		System.out.println("Please input the password");
		
		char retpaswrd [] =  console.readPassword();
		String pwsd = retpaswrd.toString();
		System.out.println(pwsd);
		
		
	}
	
	public static void main(String[] args) {
		ReadingPasswordFC.passwordReader();
	}

}
