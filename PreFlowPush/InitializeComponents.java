import java.util.*;

public class InitializeComponents {
	
	/**
	 * Authors: Lakshmi Nookala, Ankit Khandelwal
	 * This class initializes the following
	 * Graph with vertices and edges
	 * Edge information - capacity, flow forward and flow backward
	 * Excess and height for each node
	 */
	
	public int[] initializeVertices(int size)
	{
		int[] temp=new int[size];
		for(int i=0;i<size;i++)
		{
			temp[i]=i;
		}
		return temp;
	}
	
	public HashMap<Integer,int[]> initializeEdge(HashMap<Integer,int[]> edgeList)
	{
		/*edgeList.put(0, new int[]{1,2});
		edgeList.put(1, new int[]{2,3});
		edgeList.put(2, new int[]{4});
		edgeList.put(3, new int[]{4,5});
		edgeList.put(4, new int[]{5});
		edgeList.put(5, new int[]{});*/
		
		/*edgeList.put(0, new int[]{1,2});
		edgeList.put(1, new int[]{3});
		edgeList.put(2, new int[]{3,4});
		edgeList.put(3, new int[]{5});
		edgeList.put(4, new int[]{6});
		edgeList.put(5, new int[]{7});
		edgeList.put(6, new int[]{7});
		edgeList.put(7, new int[]{});*/
		
		/*edgeList.put(0, new int[]{1,2});
		edgeList.put(1, new int[]{2,3,4});
		edgeList.put(2, new int[]{4});
		edgeList.put(3, new int[]{5});
		edgeList.put(4, new int[]{5});
		edgeList.put(5, new int[]{});*/
		
		/*edgeList.put(0, new int[]{1,2});
		edgeList.put(1, new int[]{5});
		edgeList.put(2, new int[]{3});
		edgeList.put(3, new int[]{1,4,5});
		edgeList.put(4, new int[]{5});
		edgeList.put(5, new int[]{});*/
		
		/*edgeList.put(0, new int[]{1,4,3,17});
		edgeList.put(1, new int[]{5});
		edgeList.put(2, new int[]{12,13});
		edgeList.put(3, new int[]{8});
		edgeList.put(4, new int[]{5});
		edgeList.put(5, new int[]{6});
		edgeList.put(6, new int[]{7,11});
		edgeList.put(7, new int[]{9});
		edgeList.put(8, new int[]{9,16});
		edgeList.put(9, new int[]{16});
		edgeList.put(10, new int[]{5,7});
		edgeList.put(11, new int[]{9});
		edgeList.put(12, new int[]{8,14,15,16});
		edgeList.put(13, new int[]{12,18});
		edgeList.put(14, new int[]{18,19});
		edgeList.put(15, new int[]{14});
		edgeList.put(16, new int[]{15});
		edgeList.put(17, new int[]{2,13});
		edgeList.put(18, new int[]{});
		edgeList.put(19, new int[]{});*/
		
		/*edgeList.put(0, new int[]{1,4,3,17});
		edgeList.put(1, new int[]{5});
		edgeList.put(2, new int[]{12,13});
		edgeList.put(3, new int[]{8});
		edgeList.put(4, new int[]{5});
		edgeList.put(5, new int[]{6});
		edgeList.put(6, new int[]{7,11});
		edgeList.put(7, new int[]{9});
		edgeList.put(8, new int[]{9,16});
		edgeList.put(9, new int[]{16});
		edgeList.put(10, new int[]{5,7});
		edgeList.put(11, new int[]{9,39});
		edgeList.put(12, new int[]{8,14,15,16});
		edgeList.put(13, new int[]{12,18});
		edgeList.put(14, new int[]{18,19,30});
		edgeList.put(15, new int[]{14});
		edgeList.put(16, new int[]{15,32});
		edgeList.put(17, new int[]{2,13,29});
		edgeList.put(18, new int[]{29});
		edgeList.put(19, new int[]{18,24});
		edgeList.put(20, new int[]{});
		edgeList.put(21, new int[]{20,31});
		edgeList.put(22, new int[]{32,21});
		edgeList.put(23, new int[]{});
		edgeList.put(24, new int[]{25,35});
		edgeList.put(25, new int[]{23,26,36});
		edgeList.put(26, new int[]{37});
		edgeList.put(27, new int[]{24});
		edgeList.put(28, new int[]{18,27});
		edgeList.put(29, new int[]{28});
		edgeList.put(30, new int[]{21,23});
		edgeList.put(31, new int[]{23,39});
		edgeList.put(32, new int[]{});
		edgeList.put(33, new int[]{22});
		edgeList.put(34, new int[]{24});
		edgeList.put(35, new int[]{});
		edgeList.put(36, new int[]{26});
		edgeList.put(37, new int[]{23});
		edgeList.put(38, new int[]{22,33});
		edgeList.put(39, new int[]{});*/
		
		return edgeList;
	}

	public HashMap<int[],Integer> initializeEdgeCapacity(HashMap<int[],Integer> edgeCapacity)
	{
		/*edgeCapacity.put(new int[]{0,1}, 3);
		edgeCapacity.put(new int[]{0,2}, 3);
		edgeCapacity.put(new int[]{1,2}, 2);
		edgeCapacity.put(new int[]{1,3}, 3);
		edgeCapacity.put(new int[]{2,4}, 2);
		edgeCapacity.put(new int[]{3,4}, 4);
		edgeCapacity.put(new int[]{3,5}, 3);
		edgeCapacity.put(new int[]{4,5}, 3);*/
		
		/*edgeCapacity.put(new int[]{0,1}, 6);
		edgeCapacity.put(new int[]{0,2}, 6);
		edgeCapacity.put(new int[]{1,3}, 6);
		edgeCapacity.put(new int[]{2,3}, 6);
		edgeCapacity.put(new int[]{2,4}, 6);
		edgeCapacity.put(new int[]{3,5}, 6);
		edgeCapacity.put(new int[]{4,6}, 6);
		edgeCapacity.put(new int[]{5,7}, 6);
		edgeCapacity.put(new int[]{6,7}, 6);*/
		
		/*edgeCapacity.put(new int[]{0,1}, 2);
		edgeCapacity.put(new int[]{0,2}, 9);
		edgeCapacity.put(new int[]{1,2}, 1);
		edgeCapacity.put(new int[]{1,3}, 0);
		edgeCapacity.put(new int[]{1,4}, 0);
		edgeCapacity.put(new int[]{2,4}, 7);
		edgeCapacity.put(new int[]{3,5}, 7);
		edgeCapacity.put(new int[]{4,5}, 4);*/
		
		/*edgeCapacity.put(new int[]{0,1}, 10);
		edgeCapacity.put(new int[]{0,2}, 11);
		edgeCapacity.put(new int[]{1,5}, 8);
		edgeCapacity.put(new int[]{2,3}, 10);
		edgeCapacity.put(new int[]{3,1}, 2);
		edgeCapacity.put(new int[]{3,4}, 6);
		edgeCapacity.put(new int[]{3,5}, 2);
		edgeCapacity.put(new int[]{4,5}, 5);*/
		
		/*edgeCapacity.put(new int[]{0,1}, 30);
		edgeCapacity.put(new int[]{0,4}, 20);
		edgeCapacity.put(new int[]{0,3}, 5);
		edgeCapacity.put(new int[]{0,17}, 10);
		edgeCapacity.put(new int[]{1,5}, 50);
		edgeCapacity.put(new int[]{2,12}, 15);
		edgeCapacity.put(new int[]{2,13}, 10);
		edgeCapacity.put(new int[]{3,8}, 11);
		edgeCapacity.put(new int[]{4,5}, 20);
		edgeCapacity.put(new int[]{5,6}, 10);
		edgeCapacity.put(new int[]{6,7}, 13);
		edgeCapacity.put(new int[]{6,11}, 10);
		edgeCapacity.put(new int[]{7,9}, 12);
		edgeCapacity.put(new int[]{8,9}, 11);
		edgeCapacity.put(new int[]{8,16}, 10);
		edgeCapacity.put(new int[]{9,16}, 10);
		edgeCapacity.put(new int[]{10,5}, 20);
		edgeCapacity.put(new int[]{10,7}, 11);
		edgeCapacity.put(new int[]{11,9}, 11);
		edgeCapacity.put(new int[]{12,8}, 11);
		edgeCapacity.put(new int[]{12,14}, 10);
		edgeCapacity.put(new int[]{12,15}, 10);
		edgeCapacity.put(new int[]{12,16}, 10);
		edgeCapacity.put(new int[]{13,12}, 10);
		edgeCapacity.put(new int[]{13,18}, 12);
		edgeCapacity.put(new int[]{14,18}, 13);
		edgeCapacity.put(new int[]{14,19}, 10);
		edgeCapacity.put(new int[]{15,14}, 10);
		edgeCapacity.put(new int[]{16,15}, 9);
		edgeCapacity.put(new int[]{17,2}, 5);
		edgeCapacity.put(new int[]{17,13}, 10);	*/	
		
		/*edgeCapacity.put(new int[]{0,1}, 30);
		edgeCapacity.put(new int[]{0,4}, 20);
		edgeCapacity.put(new int[]{0,3}, 5);
		edgeCapacity.put(new int[]{0,17}, 10);
		edgeCapacity.put(new int[]{1,5}, 50);
		edgeCapacity.put(new int[]{2,12}, 15);
		edgeCapacity.put(new int[]{2,13}, 10);
		edgeCapacity.put(new int[]{3,8}, 11);
		edgeCapacity.put(new int[]{4,5}, 20);
		edgeCapacity.put(new int[]{5,6}, 10);
		edgeCapacity.put(new int[]{6,7}, 13);
		edgeCapacity.put(new int[]{6,11}, 10);
		edgeCapacity.put(new int[]{7,9}, 12);
		edgeCapacity.put(new int[]{8,9}, 11);
		edgeCapacity.put(new int[]{8,16}, 10);
		edgeCapacity.put(new int[]{9,16}, 10);
		edgeCapacity.put(new int[]{10,5}, 20);
		edgeCapacity.put(new int[]{10,7}, 11);
		edgeCapacity.put(new int[]{11,9}, 11);
		edgeCapacity.put(new int[]{11,39}, 11);
		edgeCapacity.put(new int[]{12,8}, 11);
		edgeCapacity.put(new int[]{12,14}, 10);
		edgeCapacity.put(new int[]{12,15}, 10);
		edgeCapacity.put(new int[]{12,16}, 10);
		edgeCapacity.put(new int[]{13,12}, 10);
		edgeCapacity.put(new int[]{13,18}, 12);
		edgeCapacity.put(new int[]{14,18}, 13);
		edgeCapacity.put(new int[]{14,19}, 10);
		edgeCapacity.put(new int[]{14,30}, 10);
		edgeCapacity.put(new int[]{15,14}, 10);
		edgeCapacity.put(new int[]{16,15}, 9);
		edgeCapacity.put(new int[]{16,32}, 8);
		edgeCapacity.put(new int[]{17,2}, 5);
		edgeCapacity.put(new int[]{17,13}, 10);
		edgeCapacity.put(new int[]{17,29}, 13);
		edgeCapacity.put(new int[]{17,13}, 10);
		edgeCapacity.put(new int[]{18,29}, 12);
		edgeCapacity.put(new int[]{19,18}, 10);
		edgeCapacity.put(new int[]{19,24}, 10);
		edgeCapacity.put(new int[]{21,20}, 10);
		edgeCapacity.put(new int[]{21,31}, 6);
		edgeCapacity.put(new int[]{22,21}, 9);
		edgeCapacity.put(new int[]{22,32}, 10);
		edgeCapacity.put(new int[]{24,25}, 12);
		edgeCapacity.put(new int[]{24,35}, 11);
		edgeCapacity.put(new int[]{25,23}, 9);
		edgeCapacity.put(new int[]{25,26}, 10);
		edgeCapacity.put(new int[]{25,36}, 14);
		edgeCapacity.put(new int[]{26,37}, 7);
		edgeCapacity.put(new int[]{27,24}, 14);
		edgeCapacity.put(new int[]{28,18}, 14);
		edgeCapacity.put(new int[]{28,27}, 12);
		edgeCapacity.put(new int[]{29,28}, 13);
		edgeCapacity.put(new int[]{30,21}, 9);
		edgeCapacity.put(new int[]{30,23}, 6);
		edgeCapacity.put(new int[]{31,23}, 7);
		edgeCapacity.put(new int[]{31,39}, 10);
		edgeCapacity.put(new int[]{33,22}, 12);
		edgeCapacity.put(new int[]{34,24}, 13);
		edgeCapacity.put(new int[]{36,26}, 10);
		edgeCapacity.put(new int[]{37,23}, 7);
		edgeCapacity.put(new int[]{38,22}, 9);
		edgeCapacity.put(new int[]{38,33}, 10);*/
		
		
		return edgeCapacity;
	}
	public HashMap<int[],Integer> initializeEdgeFFlow(HashMap<int[],Integer> edgeFFlow)
	{
		/*edgeFFlow.put(new int[]{0,1}, 0);
		edgeFFlow.put(new int[]{0,2}, 0);
		edgeFFlow.put(new int[]{1,3}, 0);
		edgeFFlow.put(new int[]{1,2}, 0);
		edgeFFlow.put(new int[]{2,4}, 0);
		edgeFFlow.put(new int[]{3,4}, 0);
		edgeFFlow.put(new int[]{3,5}, 0);
		edgeFFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeFFlow.put(new int[]{0,1}, 0);
		edgeFFlow.put(new int[]{0,2}, 0);
		edgeFFlow.put(new int[]{1,3}, 0);
		edgeFFlow.put(new int[]{2,3}, 0);
		edgeFFlow.put(new int[]{2,4}, 0);
		edgeFFlow.put(new int[]{3,5}, 0);
		edgeFFlow.put(new int[]{4,6}, 0);
		edgeFFlow.put(new int[]{5,7}, 0);
		edgeFFlow.put(new int[]{6,7}, 0);*/
		
		/*edgeFFlow.put(new int[]{0,1}, 0);
		edgeFFlow.put(new int[]{0,2}, 0);
		edgeFFlow.put(new int[]{1,2}, 0);
		edgeFFlow.put(new int[]{1,3}, 0);
		edgeFFlow.put(new int[]{1,4}, 0);
		edgeFFlow.put(new int[]{2,4}, 0);
		edgeFFlow.put(new int[]{3,5}, 0);
		edgeFFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeFFlow.put(new int[]{0,1}, 0);
		edgeFFlow.put(new int[]{0,2}, 0);
		edgeFFlow.put(new int[]{1,5}, 0);
		edgeFFlow.put(new int[]{2,3}, 0);
		edgeFFlow.put(new int[]{3,1}, 0);
		edgeFFlow.put(new int[]{3,4}, 0);
		edgeFFlow.put(new int[]{3,5}, 0);
		edgeFFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeFFlow.put(new int[]{0,1}, 00);
		edgeFFlow.put(new int[]{0,4}, 0);
		edgeFFlow.put(new int[]{0,3}, 0);
		edgeFFlow.put(new int[]{0,17}, 0);
		edgeFFlow.put(new int[]{1,5}, 0);
		edgeFFlow.put(new int[]{2,12}, 0);
		edgeFFlow.put(new int[]{2,13}, 0);
		edgeFFlow.put(new int[]{3,8}, 0);
		edgeFFlow.put(new int[]{4,5}, 0);
		edgeFFlow.put(new int[]{5,6}, 0);
		edgeFFlow.put(new int[]{6,7}, 0);
		edgeFFlow.put(new int[]{6,11}, 0);
		edgeFFlow.put(new int[]{7,9}, 0);
		edgeFFlow.put(new int[]{8,9}, 0);
		edgeFFlow.put(new int[]{8,16}, 0);
		edgeFFlow.put(new int[]{9,16}, 0);
		edgeFFlow.put(new int[]{10,5}, 0);
		edgeFFlow.put(new int[]{10,7}, 0);
		edgeFFlow.put(new int[]{11,9}, 0);
		edgeFFlow.put(new int[]{12,8}, 0);
		edgeFFlow.put(new int[]{12,14}, 0);
		edgeFFlow.put(new int[]{12,15}, 0);
		edgeFFlow.put(new int[]{12,16}, 0);
		edgeFFlow.put(new int[]{13,12}, 0);
		edgeFFlow.put(new int[]{13,18}, 0);
		edgeFFlow.put(new int[]{14,18}, 0);
		edgeFFlow.put(new int[]{14,19}, 0);
		edgeFFlow.put(new int[]{15,14}, 0);
		edgeFFlow.put(new int[]{16,15}, 0);
		edgeFFlow.put(new int[]{17,2}, 0);
		edgeFFlow.put(new int[]{17,13}, 0);*/
		
		/*edgeFFlow.put(new int[]{0,1}, 0);
		edgeFFlow.put(new int[]{0,4}, 0);
		edgeFFlow.put(new int[]{0,3}, 0);
		edgeFFlow.put(new int[]{0,17}, 0);
		edgeFFlow.put(new int[]{1,5}, 0);
		edgeFFlow.put(new int[]{2,12}, 0);
		edgeFFlow.put(new int[]{2,13}, 0);
		edgeFFlow.put(new int[]{3,8}, 0);
		edgeFFlow.put(new int[]{4,5}, 0);
		edgeFFlow.put(new int[]{5,6}, 0);
		edgeFFlow.put(new int[]{6,7}, 0);
		edgeFFlow.put(new int[]{6,11}, 0);
		edgeFFlow.put(new int[]{7,9}, 0);
		edgeFFlow.put(new int[]{8,9}, 0);
		edgeFFlow.put(new int[]{8,16}, 0);
		edgeFFlow.put(new int[]{9,16}, 0);
		edgeFFlow.put(new int[]{10,5}, 0);
		edgeFFlow.put(new int[]{10,7}, 0);
		edgeFFlow.put(new int[]{11,9}, 0);
		edgeFFlow.put(new int[]{11,39}, 0);
		edgeFFlow.put(new int[]{12,8}, 0);
		edgeFFlow.put(new int[]{12,14}, 0);
		edgeFFlow.put(new int[]{12,15}, 0);
		edgeFFlow.put(new int[]{12,16}, 0);
		edgeFFlow.put(new int[]{13,12}, 0);
		edgeFFlow.put(new int[]{13,18}, 0);
		edgeFFlow.put(new int[]{14,18}, 0);
		edgeFFlow.put(new int[]{14,19}, 0);
		edgeFFlow.put(new int[]{14,30}, 0);
		edgeFFlow.put(new int[]{15,14}, 0);
		edgeFFlow.put(new int[]{16,15}, 0);
		edgeFFlow.put(new int[]{16,32}, 0);
		edgeFFlow.put(new int[]{17,2}, 0);
		edgeFFlow.put(new int[]{17,13}, 0);
		edgeFFlow.put(new int[]{17,29}, 0);
		edgeFFlow.put(new int[]{17,13}, 0);
		edgeFFlow.put(new int[]{18,29}, 0);
		edgeFFlow.put(new int[]{19,18}, 0);
		edgeFFlow.put(new int[]{19,24}, 0);
		edgeFFlow.put(new int[]{21,20}, 0);
		edgeFFlow.put(new int[]{21,31}, 0);
		edgeFFlow.put(new int[]{22,21}, 0);
		edgeFFlow.put(new int[]{22,32}, 0);
		edgeFFlow.put(new int[]{24,25}, 0);
		edgeFFlow.put(new int[]{24,35}, 0);
		edgeFFlow.put(new int[]{25,23}, 0);
		edgeFFlow.put(new int[]{25,26}, 0);
		edgeFFlow.put(new int[]{25,36}, 0);
		edgeFFlow.put(new int[]{26,37}, 0);
		edgeFFlow.put(new int[]{27,24}, 0);
		edgeFFlow.put(new int[]{28,18}, 0);
		edgeFFlow.put(new int[]{28,27}, 0);
		edgeFFlow.put(new int[]{29,28}, 0);
		edgeFFlow.put(new int[]{30,21}, 0);
		edgeFFlow.put(new int[]{30,23}, 0);
		edgeFFlow.put(new int[]{31,23}, 0);
		edgeFFlow.put(new int[]{31,39}, 0);
		edgeFFlow.put(new int[]{33,22}, 0);
		edgeFFlow.put(new int[]{34,24}, 0);
		edgeFFlow.put(new int[]{36,26}, 0);
		edgeFFlow.put(new int[]{37,23}, 0);
		edgeFFlow.put(new int[]{38,22}, 0);
		edgeFFlow.put(new int[]{38,33}, 0);*/
		return edgeFFlow;
	}
	public HashMap<int[],Integer> initializeEdgeBFlow(HashMap<int[],Integer> edgeBFlow)
	{
		/*edgeBFlow.put(new int[]{0,1}, 0);
		edgeBFlow.put(new int[]{0,2}, 0);
		edgeBFlow.put(new int[]{1,2}, 0);
		edgeBFlow.put(new int[]{1,3}, 0);
		edgeBFlow.put(new int[]{2,4}, 0);
		edgeBFlow.put(new int[]{3,4}, 0);
		edgeBFlow.put(new int[]{3,5}, 0);
		edgeBFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeBFlow.put(new int[]{0,1}, 0);
		edgeBFlow.put(new int[]{0,2}, 0);
		edgeBFlow.put(new int[]{1,3}, 0);
		edgeBFlow.put(new int[]{2,3}, 0);
		edgeBFlow.put(new int[]{2,4}, 0);
		edgeBFlow.put(new int[]{3,5}, 0);
		edgeBFlow.put(new int[]{4,6}, 0);
		edgeBFlow.put(new int[]{5,7}, 0);
		edgeBFlow.put(new int[]{6,7}, 0);*/
		
		/*edgeBFlow.put(new int[]{0,1}, 0);
		edgeBFlow.put(new int[]{0,2}, 0);
		edgeBFlow.put(new int[]{1,2}, 0);
		edgeBFlow.put(new int[]{1,3}, 0);
		edgeBFlow.put(new int[]{1,4}, 0);
		edgeBFlow.put(new int[]{2,4}, 0);
		edgeBFlow.put(new int[]{3,5}, 0);
		edgeBFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeBFlow.put(new int[]{0,1}, 0);
		edgeBFlow.put(new int[]{0,2}, 0);
		edgeBFlow.put(new int[]{1,5}, 0);
		edgeBFlow.put(new int[]{2,3}, 0);
		edgeBFlow.put(new int[]{3,1}, 0);
		edgeBFlow.put(new int[]{3,4}, 0);
		edgeBFlow.put(new int[]{3,5}, 0);
		edgeBFlow.put(new int[]{4,5}, 0);*/
		
		/*edgeBFlow.put(new int[]{0,1}, 00);
		edgeBFlow.put(new int[]{0,4}, 0);
		edgeBFlow.put(new int[]{0,3}, 0);
		edgeBFlow.put(new int[]{0,17}, 0);
		edgeBFlow.put(new int[]{1,5}, 0);
		edgeBFlow.put(new int[]{2,12}, 0);
		edgeBFlow.put(new int[]{2,13}, 0);
		edgeBFlow.put(new int[]{3,8}, 0);
		edgeBFlow.put(new int[]{4,5}, 0);
		edgeBFlow.put(new int[]{5,6}, 0);
		edgeBFlow.put(new int[]{6,7}, 0);
		edgeBFlow.put(new int[]{6,11}, 0);
		edgeBFlow.put(new int[]{7,9}, 0);
		edgeBFlow.put(new int[]{8,9}, 0);
		edgeBFlow.put(new int[]{8,16}, 0);
		edgeBFlow.put(new int[]{9,16}, 0);
		edgeBFlow.put(new int[]{10,5}, 0);
		edgeBFlow.put(new int[]{10,7}, 0);
		edgeBFlow.put(new int[]{11,9}, 0);
		edgeBFlow.put(new int[]{12,8}, 0);
		edgeBFlow.put(new int[]{12,14}, 0);
		edgeBFlow.put(new int[]{12,15}, 0);
		edgeBFlow.put(new int[]{12,16}, 0);
		edgeBFlow.put(new int[]{13,12}, 0);
		edgeBFlow.put(new int[]{13,18}, 0);
		edgeBFlow.put(new int[]{14,18}, 0);
		edgeBFlow.put(new int[]{14,19}, 0);
		edgeBFlow.put(new int[]{15,14}, 0);
		edgeBFlow.put(new int[]{16,15}, 0);
		edgeBFlow.put(new int[]{17,2}, 0);
		edgeBFlow.put(new int[]{17,13}, 0);	*/	
		
		/*edgeBFlow.put(new int[]{0,1}, 0);
		edgeBFlow.put(new int[]{0,4}, 0);
		edgeBFlow.put(new int[]{0,3}, 0);
		edgeBFlow.put(new int[]{0,17}, 0);
		edgeBFlow.put(new int[]{1,5}, 0);
		edgeBFlow.put(new int[]{2,12}, 0);
		edgeBFlow.put(new int[]{2,13}, 0);
		edgeBFlow.put(new int[]{3,8}, 0);
		edgeBFlow.put(new int[]{4,5}, 0);
		edgeBFlow.put(new int[]{5,6}, 0);
		edgeBFlow.put(new int[]{6,7}, 0);
		edgeBFlow.put(new int[]{6,11}, 0);
		edgeBFlow.put(new int[]{7,9}, 0);
		edgeBFlow.put(new int[]{8,9}, 0);
		edgeBFlow.put(new int[]{8,16}, 0);
		edgeBFlow.put(new int[]{9,16}, 0);
		edgeBFlow.put(new int[]{10,5}, 0);
		edgeBFlow.put(new int[]{10,7}, 0);
		edgeBFlow.put(new int[]{11,9}, 0);
		edgeBFlow.put(new int[]{11,39}, 0);
		edgeBFlow.put(new int[]{12,8}, 0);
		edgeBFlow.put(new int[]{12,14}, 0);
		edgeBFlow.put(new int[]{12,15}, 0);
		edgeBFlow.put(new int[]{12,16}, 0);
		edgeBFlow.put(new int[]{13,12}, 0);
		edgeBFlow.put(new int[]{13,18}, 0);
		edgeBFlow.put(new int[]{14,18}, 0);
		edgeBFlow.put(new int[]{14,19}, 0);
		edgeBFlow.put(new int[]{14,30}, 0);
		edgeBFlow.put(new int[]{15,14}, 0);
		edgeBFlow.put(new int[]{16,15}, 0);
		edgeBFlow.put(new int[]{16,32}, 0);
		edgeBFlow.put(new int[]{17,2}, 0);
		edgeBFlow.put(new int[]{17,13}, 0);
		edgeBFlow.put(new int[]{17,29}, 0);
		edgeBFlow.put(new int[]{17,13}, 0);
		edgeBFlow.put(new int[]{18,29}, 0);
		edgeBFlow.put(new int[]{19,18}, 0);
		edgeBFlow.put(new int[]{19,24}, 0);
		edgeBFlow.put(new int[]{21,20}, 0);
		edgeBFlow.put(new int[]{21,31}, 0);
		edgeBFlow.put(new int[]{22,21}, 0);
		edgeBFlow.put(new int[]{22,32}, 0);
		edgeBFlow.put(new int[]{24,25}, 0);
		edgeBFlow.put(new int[]{24,35}, 0);
		edgeBFlow.put(new int[]{25,23}, 0);
		edgeBFlow.put(new int[]{25,26}, 0);
		edgeBFlow.put(new int[]{25,36}, 0);
		edgeBFlow.put(new int[]{26,37}, 0);
		edgeBFlow.put(new int[]{27,24}, 0);
		edgeBFlow.put(new int[]{28,18}, 0);
		edgeBFlow.put(new int[]{28,27}, 0);
		edgeBFlow.put(new int[]{29,28}, 0);
		edgeBFlow.put(new int[]{30,21}, 0);
		edgeBFlow.put(new int[]{30,23}, 0);
		edgeBFlow.put(new int[]{31,23}, 0);
		edgeBFlow.put(new int[]{31,39}, 0);
		edgeBFlow.put(new int[]{33,22}, 0);
		edgeBFlow.put(new int[]{34,24}, 0);
		edgeBFlow.put(new int[]{36,26}, 0);
		edgeBFlow.put(new int[]{37,23}, 0);
		edgeBFlow.put(new int[]{38,22}, 0);
		edgeBFlow.put(new int[]{38,33}, 0);*/
		
		return edgeBFlow;
	}

	//Function to initialize the excess and height values of all vertices
	public int[][] initializeExcessHeightValues(int[][] excess_height, HashMap<Integer,int[]> edgeList, int size) {
		
		for(int i=0;i<size;i++)
		{
			excess_height[i][0]=i;
			for(int j=0;j<3;j++)
			{
				if(excess_height[i][0]== 0)
				{
					excess_height[i][1] = (int) Double.POSITIVE_INFINITY;
					excess_height[i][2] = size;
				}
				else
				{
					excess_height[i][1] = 0;
					excess_height[i][2] = 0;
				}
			}
		}
		return excess_height;
	}
}