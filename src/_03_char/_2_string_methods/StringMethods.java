package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String variable1 = "one";
		String variable2 = "two";
		String variable3 = "three";
		
				// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(variable1.charAt(1));
		System.out.println(variable2.charAt(2));
		System.out.println(variable3.charAt(3));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(variable1.length());
		System.out.println(variable2.length());
		System.out.println(variable3.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		
		variable1 = "one";
		
		for( int index = 0; index < variable1.length(); index++) {
			System.out.print(variable1.charAt(index));
		}
		
		variable2 = " two";
		
		for(int index = 0; index < variable2.length(); index++) {
			System.out.print(variable2.charAt(index));
		}
		
		variable3 = " three";
		
		for(int index = 0; index < variable3.length(); index++) {
			System.out.print(variable3.charAt(index));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		variable1 = "one";
		
		for(int index = 0; index < variable1.length(); index++) {
			if(variable1.charAt(index) == 'e') {
				System.out.print(" Character found!");
			} else{
				System.out.print(" The Character has not been found!");
			}
		}
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		}
		
	}
	



