package entrada;

import java.util.InputMismatchException;


import java.util.Scanner;

public class Entrada {

	final static Scanner sc = new Scanner(System.in);

	public Entrada() {
		super();
	}
	
	
	
	public static Byte llegirByte(String message) {
		byte userByte=0;
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userByte = sc.nextByte();
				correctFormat = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userByte;
	}
		
	public static Integer llegirInt(String message) {
		int userInt=0;
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userInt = sc.nextInt();
				correctFormat = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userInt;
	}
	
	public static Float llegirFloat(String message) {
		Float userFloat=0f;
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userFloat = sc.nextFloat();
				correctFormat = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userFloat;
	}

	public static Double llegirDouble(String message) {
		double userDouble=0f;
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userDouble = sc.nextDouble();
				correctFormat = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userDouble;
	}
	
	
	//CAUTION!! As there is no no-char, we check for length
	public static char llegirChar(String message) {
		char userChar = ' ';
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				String tempText = sc.next().toLowerCase();
				if(!(tempText.length()==0)) {
					userChar = tempText.charAt(0);
					correctFormat = true;
				}				
				
			}catch(Exception e) {
				System.out.println("Error de format");

			}
		}
				
		return userChar;
	}

	//CAUTION!! Check the given String is not a number --> ParseInt(String)
	// DO we have to check every type of number??
	public static String llegirString(String message) {
		String userString = "";
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userString = sc.next();
				correctFormat = true;	
							
			}catch(NumberFormatException e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userString;
	}

	
	public static Boolean llegirSiNo(String message) {
		String userString = "";
		boolean userAnswer = false;
		boolean correctFormat = false;
		
		while(!correctFormat) {
			
			try {
				System.out.println(message);
				userString = sc.next();
				
				if(userString.charAt(0)=='s') {
					userAnswer = true;
					correctFormat = true;
					
				}else if(userString.charAt(0)=='n'){
					userAnswer = false;
					correctFormat = true;
				}
				
			}catch(Exception e) {
				System.out.println("Error de format");
				
				//in order to avoid infinite loop
				sc.next(); 
			}
		}
				
		return userAnswer;
	}
	
	
	
}//closes class
