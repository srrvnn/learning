// http://www.vogella.com/articles/JavaAlgorithmsMergesort/article.html

/************************************************************/ 


import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList; 
import java.lang.Integer;

public class Mergesort {

	static final boolean debug = false;

	static int[] numbers; 
	static int[] helper; 

	/************************************************************/ 
	// driver function for Merge Sort 

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// declare a reader to the file 

		FileReader filereader = new FileReader("../tests/random_numbers");
		BufferedReader reader = new BufferedReader(filereader);

		// read the tokens into a string list 

		List<String> list_string_numbers = new ArrayList<String>();		
		list_string_numbers = Arrays.asList(reader.readLine().split(" "));

		// convert the list of strings into an array 

		numbers = new int[list_string_numbers.size()];
		int count = 0;

		for(String s : list_string_numbers)
			numbers[count++] = Integer.parseInt(s);		

		// small array for quick testing 
		// numbers = {8,9,10,5,2,1,4,3,6,7};

		// print input values

		if(debug) System.out.print("Random:");

		for(int i=0;i<numbers.length;i++)
			System.out.print(" "+numbers[i]);	

		System.out.println();

		// sort the numbers
		
		Sort();

		// print sorted values

		if(debug) System.out.print("Sorted:");

		for(int i=0;i<numbers.length;i++)	
			System.out.print(" "+numbers[i]);

		System.out.println();
	}

	/************************************************************/ 
	// function to perform Merge Sort

	public static void Sort() {

		// create the helper array that is used while merging. 

		helper = new int[numbers.length]; 

		// initiate the recursive function: mergesort 

		mergesort(0, numbers.length - 1);
	}

	/************************************************************/ 
	// function to recursively divide the array into two halves and merge them

	public static void mergesort(int start, int finish) {

		if(start < finish) {

			// calculate the middle element

			int middle = start + (finish - start) / 2; 

			// sort the two arrays

			mergesort(start, middle);
			mergesort(middle + 1, finish);

			// merge the two arrays

			merge(start, middle, finish);
		}
	}

	/************************************************************/ 
	// function to perform the merge of two sub arrays: @start to @middle, @middle+1 to @finish

	public static void merge(int start, int middle, int finish) {

		// copy all elements into the helper array 

		for(int i = start; i <= finish; i++) {

			helper[i] = numbers[i];
		}

		int array1_leader = start; 
		int array2_leader = middle + 1; 

		int winner = start; 

		// choosen the smaller of the two sorted arrays to build the final sorted array

		while(array1_leader <= middle && array2_leader <= finish) {

			if(helper[array1_leader] <= helper[array2_leader]) {

				numbers[winner] = helper[array1_leader];
				array1_leader++;
			}

			else {

				numbers[winner] = helper[array2_leader];
				array2_leader++;
			}

			winner++;
		}

		// choose the remaining elements in the left array 

		while(array1_leader <= middle) {

			numbers[winner] = helper[array1_leader];
			winner++;
			array1_leader++;
		}

		// ignore the remaining elements in the right array - they are already in position
	}

}