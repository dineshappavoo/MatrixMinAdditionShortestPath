/**
 * 
 */
package matrixminadditionshortestpath;

import java.util.Scanner;


/**
 * @author Dany
 *
 */
public class MatrixMinAdditionShortestPath {

	public static int noOfVertices,noOfEdges;
	public static Graph graph=null;
	public static int INFINITY=Integer.MAX_VALUE;
	
	public static int[][] C=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixMinAdditionShortestPath matrixMinSP=new MatrixMinAdditionShortestPath();
		matrixMinSP.findShortestPath();
	}
	
	public void constructGraph()
	{

		int u, v, w;
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			noOfVertices=scanner.nextInt();
			noOfEdges=scanner.nextInt();

			graph=new Graph(noOfVertices);
			for(int i=0;i<noOfEdges;i++)
			{
				u=scanner.nextInt();
				v=scanner.nextInt();
				w=scanner.nextInt();
				graph.addEdge(u, v, w);
			}
			break;
		}
		//graph.printGraph();
	
	}
	
	/**
	 * 
	 * MATRIX-MINADDITION(A, B)
		n <- rows[A]
		let C be an nxn matrix
		for i <- 1 to n
			do for j <- 1 to n
				do ci,j <- Infinity
					for k <- 1 to n
						do ci,j <- min [ci,j, ai,k +bk,j]
		return C
	 * 
	 * 
	 */
	public void findMatrixMinAdditionShortestPath()
	{
		int[][] A=graph.getAdjacencyMatrix();
		int[][] B=graph.getAdjacencyMatrix();
		int n=A.length;
		
		C=new int[n][n];
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				C[i][j]=INFINITY;
				for(int k=1;k<n;k++)
				{
					C[i][j]=Math.min(C[i][j], (A[i][k]+B[k][j]));
				}
			}
		}
	}
	
	public void findShortestPath()
	{
		constructGraph();
		findMatrixMinAdditionShortestPath();
		int n=C.length;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.println("Distance from "+i+" to "+j+" is "+C[i][j]);
			}
		}
	}

}
