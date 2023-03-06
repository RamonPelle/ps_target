package utils;

public class ReverseString {
	public static void reverse(String data) {
 
        String reversed = "";

        for (int i = data.length() - 1; i >= 0; i--) {
        	reversed += data.charAt(i);
        }

        System.out.println("A string invertida é: " + reversed);
    }
}
