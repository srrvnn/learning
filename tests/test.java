public class test {

	public static void main(String[] args){

		int[] array_numbers = new int[]{242, 243, 135};			

		System.out.println(array_numbers.length);

		printarr(array_numbers, "Before");
		function_a(array_numbers);
		printarr(array_numbers, "After");
	}

	public static void function_a(int[] data){

		data[1] = 53;
	}

	public static void function_a(int d) {

		d = 53; 
	}

	public static void printarr(int[] a, String msg) {

		System.out.print(msg+":");
		for(int i=0;i<a.length;i++)	
			System.out.print(" "+a[i]);
		System.out.println();
	}
}