package edu.code.structures.graphs;

import java.util.Iterator;
import java.util.Vector;

/**
 * Generic Graph implementation using Vertex and Edge
 *  
 * @param <T> the type of the value being stored
 *  
 */
public class Graph<T> {
	
	protected Vector<Vertex<T>> vertices = new Vector<Vertex<T>>(); 
	protected Vector<Edge<T>> edges = new Vector<Edge<T>>();
	
	protected boolean directed = false;
	
	// getter and setter for directed instance variable
	
	public boolean isDirected() {
		return directed;
	}
	
	public void setDirected(boolean newDirected) {
		this.directed = newDirected;
	}
	
	// add, remove, list and find vertices 
	
	public Vertex<T> addVertex(T newObject) {
		
		Vertex<T> newVertex = new Vertex<T>(newObject);
		vertices.add(newVertex);
		
		return newVertex;		
	}
	
	public void printVertex() {
		
		Iterator<Vertex<T>> i = vertices.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
	
	// add, remove, list and find edges 
	
	public Edge<T> addEdge(Vertex<T> a, Vertex<T> b){
		
		a.addNeighbor(b);
		
		if(!this.directed)
			b.addNeighbor(a);
		
		Edge<T> newEdge = new Edge<T>(a, b);		
		return newEdge; 
	}
	
	public Vector<Vertex<T>> findNeighbors(Vertex<T> v) {
		
		return v.getNeighbors();
	}
	
	// static nested classes: vertex and edge
	
	private static class Vertex<T> {
		
		protected T data;
		protected boolean visited; 
		
		protected Vector<Vertex<T>> neighbors; 
		
		Vertex(T d) {		
			this.data = d;
			neighbors = new Vector<Vertex<T>>();
		}
		
		public String toString() {
			return data.toString();
		}
		
		public void addNeighbor(Vertex<T> v) {
			
			this.neighbors.add(v);
		}
		
		public Vector<Vertex<T>> getNeighbors(){
			return this.neighbors;
		}
	}
	
	private static class Edge<T> {
		
		protected Vertex<T> start, end;
		protected double weight;
		
		public Edge(Vertex<T> a, Vertex<T> b) {
			
			this(a, b, 0.0);
		}	
		
		public Edge(Vertex<T> v1, Vertex<T> v2, double d) {

			this.start = v1;
			this.end = v2; 
			this.weight = d;			
		}		
	} 
	
	public static void main(String[] args) {
		
		System.out.println("Hello World. Graph, coming soon.");
		
		Graph<Integer> g = new Graph<Integer>();
		
		Vertex<Integer> startVertex = g.addVertex(new Integer(100));
		Vertex<Integer> testVertex = null; 
		
		for(int i = 0; i < 10; i++) {
			
			Vertex<Integer> endVertex = g.addVertex(new Integer(i));			
			g.addEdge(startVertex, endVertex);
			
			testVertex = endVertex;
		}
		
		System.out.println("Printing Neighbors: ");
		
		Vector<Vertex<Integer>> v = g.findNeighbors(testVertex);		
		Iterator<Vertex<Integer>> i = v.iterator();
		
		while(i.hasNext()){
			System.out.print( i.next().toString() + " " );
		}		
	}
}
