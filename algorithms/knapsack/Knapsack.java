import java.io.FileReader; 
import java.io.BufferedReader;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Knapsack {

	public final static boolean DEBUG = false;

	public int limit;
	public int items;
	public int[] values;
	public int[] weights;

	public int result;
	public ArrayList<Integer> set;	
	public HashMap<String,Integer> memory;

	public int depth; 

	public void init(String[] information) {

		limit = Integer.parseInt(information[0]);		

		String[] string_values = information[1].split(" ");
		String[] string_weights = information[2].split(" ");

		items = string_values.length;

		values = new int[string_values.length];
		weights = new int[string_weights.length];

		for (int i = string_values.length - 1; i >= 0; i--) {

			values[i] = Integer.parseInt(string_values[i]);
			weights[i] = Integer.parseInt(string_weights[i]);
		}

		depth = -1;
	}

	public void computeValue() {

		result = compute(items, limit);
	}

	public int compute(int items, int limit) {

		depth++;

		String tab = "";

		for (int i = 0; i < depth; i++) {

			tab = tab + "-";
		}		

		System.out.println(tab + "Items: " + items + ", Limit: " + limit);

		if (items < 1 || limit < 1) 
			return 0;

		int result1, result2; 

		result1 = compute(items - 1, limit);

		if (limit - weights[items - 1] < 0) 
			result2 = 0;
		else 
			result2 = values[items - 1] + compute(items - 1, limit - weights[items-1]);

		System.out.println(tab + "Result1: " + result1 + ", Result2: " + result2);

		depth--;

		return result1 > result2 ? result1 : result2; 
	}

	public void print() {

		if (DEBUG) {

			System.out.println("Limit: " + this.limit);
			System.out.println("Values: " + Arrays.toString(values));
			System.out.println("Weights: " + Arrays.toString(weights));	
		}		

		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {

		String input_file = "input.txt";

		if (args.length > 0) {

			input_file = args[0];
		}		

		try {

			BufferedReader br = new BufferedReader(new FileReader(input_file));	
			String b;		

			b = br.readLine();

			for (int i = Integer.parseInt(b); i > 0; i--) {

				String[] info = { br.readLine(), br.readLine(), br.readLine() };

				Knapsack k = new Knapsack();

				k.init(info);
				k.computeValue();

				k.print();

				// print results;
			}	

		} catch (Exception e) {

			System.out.println("Whoa. This: " + e.toString());			
		}

	}
}