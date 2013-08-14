import java.util.*;

public class PFPMain {

	/**
	 * Authors: Lakshmi Nookala, Ankit Khandelwal
	 * This class initializes the program
	 * Calls the PreFlow Push Logic
	 * Passes the graph to the Logic
	 */
	static int size =40;
	public static void main(String[] args) {

		InitializeComponents ic = new InitializeComponents();
		PreflowPushLogic pfp;
		int[] vertices = ic.initializeVertices(size);
		HashMap<Integer,int[]> edgeList= new HashMap<Integer,int[]>();
		HashMap<int[], Integer> edgeCapacity = new HashMap<int[], Integer>();
		HashMap<int[], Integer> edgeFFlow = new HashMap<int[], Integer>();
		HashMap<int[], Integer> edgeBFlow = new HashMap<int[], Integer>();
		int[][] excess_height = new int[vertices.length][3];
		
		//Add elements to the hashmap
		//edgeInfo = ic.initializeEdgeInfo(edgeInfo);
		edgeList=ic.initializeEdge(edgeList);
		edgeCapacity=ic.initializeEdgeCapacity(edgeCapacity);
		edgeFFlow=ic.initializeEdgeFFlow(edgeFFlow);
		edgeBFlow=ic.initializeEdgeBFlow(edgeBFlow);
		//Store edge info in an ArrayList
		
		excess_height = ic.initializeExcessHeightValues(excess_height,edgeList,size);
		
		//Call the method in PreflowPush class
		pfp = new PreflowPushLogic(vertices, edgeList, edgeCapacity, edgeFFlow, edgeBFlow,excess_height);
		
		long startTime = System.nanoTime();		
		pfp.calculateMaxFlow();
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("Running time : "+totalTime);
	}
}