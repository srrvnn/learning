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

	/************************************************************/ 
	// driver function for Heap Sort 

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// declare a reader to the file 

		FileReader filereader = new FileReader("random_numbers.txt");
		BufferedReader reader = new BufferedReader(filereader);

		// read the tokens into a string list 

		List<String> list_string_numbers = new ArrayList<String>();		
		list_string_numbers = Arrays.asList(reader.readLine().split(" "));

		// convert the list of strings into an array 

		int[] array_numbers = new int[list_string_numbers.size()];
		int count = 0;

		for(String s : list_string_numbers)
			array_numbers[count++] = Integer.parseInt(s);		

		// array for quick testing 
		// int[] array_numbers = {8,9,10,5,2,1,4,3,6,7};

		// print input values

		if(debug) System.out.print("Random:");

		for(int i=0;i<array_numbers.length;i++)
			System.out.print(" "+array_numbers[i]);	

		System.out.println();

		// sort the numbers
		
		Sort(array_numbers);

		// print sorted values

		if(debug) System.out.print("Sorted:");

		for(int i=0;i<array_numbers.length;i++)	
			System.out.print(" "+array_numbers[i]);

		System.out.println();
	}

	/************************************************************/ 
	// function to perform Heap Sort

	public static void Sort(int[] data) { 

		if (debug) System.out.println("Sorting Begins here.");

		// build heap with random data 

		buildHeap(data);

		if (debug) printarr(data,"buildHeap Complete");	

		// swap the top element to the end as many times 

		int count = data.length; 

		while(count > 1)
		{
			count--; 
			exchange(data, 0, count);
			if(debug) printarr(data,"exchange "+Integer.toString(count));
			downHeap(data, 0, count);	
			if(debug) printarr(data,"downHeap "+Integer.toString(count));
		}
	}

	/************************************************************/ 
	// function to build a heap of the given array @data in place 

	public static void buildHeap(int[] data) { 

		int count = data.length / 2;

		while(count > 0) {

			count--;
			downHeap(data, count, data.length);

			if(debug) printarr(data,Integer.toString(count)+"-"+Integer.toString(data.length));
		}
	}

	/************************************************************/ 
	// function to check the position of an element at @start in the heap @data

	public static void downHeap(int[] data, int start, int end)	{		

		int child, temp;

	    for(temp = data[start]; (2 * start + 1) < end; start = child ) {

	    	// get the left child

            child = 2 * start + 1; 

            // if the left child is smaller than the right, choose the right child. 

			if( child != end-1 && data[child] < data[child+1] )
                child++;

            // if the parent is smaller than the greater child, move the child upward.

            if( temp < data[child] )
                data[start] = data[child];
            else
                break;
		}

		// store the element

	    data[start] = temp;
	}

	/************************************************************/ 
	// function to swap two elements in an array @data, source @s and destination @d	

	public static void exchange(int[] data, int s, int d) {

		int swap = data[s];
		data[s] = data[d];
		data[d] = swap;
	}

	/************************************************************/ 
	// function to print contents on an array @data	preceded by a @msg

	public static void printarr(int[] data, String msg) {

		System.out.print(msg+":");
		for(int i=0;i<data.length;i++)	
			System.out.print(" "+data[i]);
		System.out.println();
	}
}