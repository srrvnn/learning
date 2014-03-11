import java.lang.StringBuilder;

class Strings {

	static String input;
	static int pointer;

	public static String getReverse(String type) {		

		switch (type) {

		default:
		case "b":

			StringBuilder sb = new StringBuilder(input);	
			return sb.reverse().toString();						

		case "r":

			pointer = input.length() - 1;
			return reverse(pointer);				

		case "i":			

			StringBuilder sbr = new StringBuilder("");

			for(int i = input.length() - 1; i >= 0; i--)				
				sbr.append(input.charAt(i));				

			return sbr.toString();
		}
	}

	public static String reverse(int p) {

		if(p == -1) return "";
		return input.charAt(p) + reverse(p-1);
	}

	public static void main(String[] args) {

		Strings.input = "Hello World";
		System.out.println(Strings.getReverse("i"));
	}
}