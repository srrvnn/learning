// http://www.sorting-algorithms.com/heap-sort

/************************************************************/ 

// O(n log n) time - O(1) space - not stable

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList; 
import java.lang.Integer;

public class Heapsort {

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
	// function to perform Heap Sort

	public static void Sort() { 

		if (debug) System.out.println("Sorting Begins here.");

		// build heap with random data 

		buildHeap();

		if (debug) printarr("buildHeap Complete");	

		// swap the top element to the end as many times 

		int count = numbers.length; 

		while(count > 1)
		{
			count--; 
			exchange(0, count);
			if(debug) printarr("exchange "+Integer.toString(count));
			downHeap(0, count);	
			if(debug) printarr("downHeap "+Integer.toString(count));
		}
	}

	/************************************************************/ 
	// function to build a heap of the given array @numbers in place 

	public static void buildHeap() { 

		int count = numbers.length / 2;

		while(count > 0) {

			count--;
			downHeap(count, numbers.length);

			if(debug) printarr(Integer.toString(count)+"-"+Integer.toString(numbers.length));
		}
	}

	/************************************************************/ 
	// function to check the position of an element at @start in the heap @numbers

	public static void downHeap(int start, int end)	{		

		int child, temp;

	    for(temp = numbers[start]; (2 * start + 1) < end; start = child ) {

			// get the left child

            child = 2 * start + 1; 

            // if the left child is smaller than the right, choose the right child. 

			if( child != end-1 && numbers[child] < numbers[child+1] )
                child++;

            // if the parent is smaller than the greater child, move the child upward.

            if( temp < numbers[child] )
                numbers[start] = numbers[child];
            else
                break;
		}

		// store the element

	    numbers[start] = temp;
	}

	/************************************************************/ 
	// function to swap two elements in an array @numbers, source @s and destination @d	

	public static void exchange(int s, int d) {

		int swap = numbers[s];
		numbers[s] = numbers[d];
		numbers[d] = swap;
	}

	/************************************************************/ 
	// function to print contents on an array @numbers preceded by a @msg

	public static void printarr(String msg) {

		System.out.print(msg+":");
		for(int i=0;i<numbers.length;i++)	
			System.out.print(" "+numbers[i]);
		System.out.println();
	}
}