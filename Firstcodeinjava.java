package Javacode;

public class Firstcodeinjava {

	public static void main(String[] args) {
	
		 String input = "abcd";
	        StringBuilder output = new StringBuilder();
	        
	        for (int i = 0; i < input.length(); i++) {
	        
	            output.append(input.charAt(i)).append(input.charAt(i));
	        }
	        
	        System.out.println(output.toString());

	}

}
