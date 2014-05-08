Matrix Min Addition Shortest Path (All Pairs)
=========

This is known as min-addition operation on two matrices and is similar to multiplication of matrices with 
the sum operation replaced by minimum and the product operation replaced by addition. We can compute these 
in powers of 2: L(1), L(2), L(4), ... This requires lg|V | such matrix operations and hence the time complexity 
is O(|V|3 log(|V|)).

##Complexity
	  Worst case performance  O(|V|3 log(|V|))
	  Worst case space complexity O (|V|*|V|)

##Install

This library has the java implementation of Matrix Min Addition Shortest Path algorithm to find the shortest path in a 
a directed graph G=[V,E].The following code snippet shows how to get the shortest path,

    MatrixMinAdditionShortestPath matrixMinSP=new MatrixMinAdditionShortestPath();
	matrixMinSP.findShortestPath();

###Input
	3 3
	1 2 1
	2 3 2
	1 3 3

First integer is the total number of vertices |V| in the graph G. The next integer is the number of edges |E| in the graph.
Next |E| lines has the edges information (u, v, w). All inputs must be given through terminal.

###Output
	Distance from 1 to 1 is 0
	Distance from 1 to 2 is 1
	Distance from 1 to 3 is 3
	Distance from 2 to 1 is 0
	Distance from 2 to 2 is 0
	Distance from 2 to 3 is 2
	Distance from 3 to 1 is 0
	Distance from 3 to 2 is 0
	Distance from 3 to 3 is 0
  
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))