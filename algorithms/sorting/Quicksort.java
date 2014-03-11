// http://www.vogella.com/articles/JavaAlgorithmsQuicksort/article.html
// http://www.sorting-algorithms.com/quick-sort

/************************************************************/ 

// O(n log n) average time - O(n ^ 2) worst time - O(1) space - stable

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList; 
import java.lang.Integer;

public class Quicksort {

	static final boolean debug = false; 

	static int[] numbers; 
	
	/************************************************************/ 
	// driver function for Heap Sort 

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
		// numbers = new int[]{8,9,10,5,2,1,4,3,6,7};

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
	// function to perform Quick Sort 

	public static void Sort() {

		if(numbers == null || numbers.length == 0) {

			System.out.println("Empty array found.");
			return;
		}

		// call the recursive function

		quicksort(0, numbers.length - 1);
	}

	/************************************************************/ 
	// function to move around elements with resepect to the pivot between @low to @high 

	public static void quicksort(int low, int high) {

		int i = low, j = high; 

		// choosing the middle element as pivot, theoritically any element can be a pivot

		int pivot = numbers[low + (high-low) / 2];			

		if(debug) System.out.println("Pivot: " + pivot);

		while(i <= j) {

			// iterate through and find the wrongly placed elements

			while(numbers[i] < pivot) i++; 
			while(numbers[j] > pivot) j--;

			// swap the elements if we still on the right sides

			if(i <= j){

				exchange(i, j);
				i++; 
				j--; 
			}			

			if(debug) printarr("i");
		}

		// recursively sort what was moved 

		if(low < j)	quicksort(low, j);
		if(i < high) quicksort(i, high);
	}

	/************************************************************/ 
	// function to swap two elements in an array @numbers, source @s and destination @d	

	public static void exchange(int s, int d) {

		int swap = numbers[s];
		numbers[s] = numbers[d];
		numbers[d] = swap; 
	}

	/************************************************************/ 
	// function to print contents o the array @numbers preceded by a @msg

	public static void printarr(String msg) {

		System.out.print(msg+":");
		for(int i=0;i<numbers.length;i++)	
			System.out.print(" "+numbers[i]);
		System.out.println();
	}
}