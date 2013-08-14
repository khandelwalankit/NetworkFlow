import java.util.*;
import java.util.Map.Entry;

public class PreflowPushLogic {
	
	/**
	 * Authors: Lakshmi Nookala, Ankit Khandelwal
	 * This class calculates Maxflow 
	 * using Push and Relabel functions
	 */
	
	int flag = 0;
	int[] vertices;
	HashMap<Integer, int[]> edgeList;
	HashMap<int[], Integer> edgeCapacity;
	HashMap<int[], Integer> edgeFFlow;
	HashMap<int[], Integer> edgeBFlow;
	int[][] excess_height;
	//int[][] edgeInfoArray;
	//Object[] edges;
	
	int[] tempVertices;
	
	public PreflowPushLogic(int[] vertices2, HashMap<Integer, int[]> edgeList2,
			HashMap<int[], Integer> edgeCapacity2,
			HashMap<int[], Integer> edgeFFlow2,
			HashMap<int[], Integer> edgeBFlow2, int[][] excess_height2) {
		
		// TODO Auto-generated constructor stub
		vertices=vertices2;
		edgeList=edgeList2;
		edgeCapacity=edgeCapacity2;
		edgeFFlow=edgeFFlow2;
		edgeBFlow=edgeBFlow2;
		excess_height=excess_height2;	
	}

	public void calculateMaxFlow()
	{
		for(int i=0;i<vertices.length;i++)
		{
			if((excess_height[i][0] != vertices.length-1))
			{
				for(int j=0;j<edgeList.size();j++)
				{
					//System.out.println("excess of vertex : "+(char)excess_height[i][0]+" is "+excess_height[i][1]);
					if(edgeList.get(j)!=null) //Check if the edge originates from the source or not
					{
						flag = 1;
						tempVertices = new int[edgeList.get(j).length];
						for(int l=0;l<edgeList.get(j).length;l++)
						{
							tempVertices[l] = edgeList.get(j)[l];
		//					System.out.println("Temp vertices of "+j+" : "+tempVertices[l]);
						}
					}
					else
					{
						try {
							throw new Exception("Source node does not have any connections");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for(int m=0;m<tempVertices.length;m++)
					{
					
						int n;
						//int tempHeight = 0;
						for(n=0;n<vertices.length;n++)
						{
							if(excess_height[n][0] == tempVertices[m])
							{
								//System.out.println("vertices matched : "+excess_height[n][0]+" "+tempVertices[m]);
								//tempHeight = excess_height[n][2];
								break;
							}
							
						}
						if((excess_height[j][1] > 0 ))
						{
							if(excess_height[n][2] < excess_height[j][2])	
							{
								//System.out.println("vertices : "+excess_height[n][0]+" "+excess_height[j][0]);
								this.push(tempVertices[m], excess_height[j][0]);
							}
							else
							{
								this.relabel(tempVertices[m], excess_height[j][0]);
							}
						}
					}
				}
			}
		}
		
		//Check if more flow is possible
		this.checkMoreFlow();
		System.out.println("Maximum flow is "+excess_height[vertices.length-1][1]);
	}

	private void checkMoreFlow() {
	Iterator<Entry<int[], Integer>> edgeIterator = edgeCapacity.entrySet().iterator();
		
		Entry<int[], Integer> temp = null;
		
		int[] tempCapEdge;
		int tempCap, checkMoreFlow=0;
		
		while(edgeIterator.hasNext())
		{
			temp = edgeIterator.next();
			tempCapEdge = temp.getKey();
			tempCap = temp.getValue();
			if(tempCap==0)
			{
				int tempVertex0 = tempCapEdge[0];
				int tempVertex1 = tempCapEdge[1];
				for(int i=0;i<vertices.length;i++)
				{
					if(tempVertex1==excess_height[i][0] && excess_height[i][1] > 0)
					{
						if(!(tempVertex1 != vertices[vertices.length-1] || tempVertex0 != vertices[0]))
						{
							checkMoreFlow++;
							excess_height[tempVertex0][1] += excess_height[i][1];
							excess_height[i][1]=0;
						}
						
					}
				}
			}
		}
		
		if(checkMoreFlow>0)
			this.calculateMaxFlow();		
	}

	public void push(int vertexW, int vertexV)
	{
		//System.out.println("in push for : "+ vertexV+" "+vertexW);
		Iterator<Entry<int[], Integer>> edgeIterator = edgeCapacity.entrySet().iterator();
		Iterator<Entry<int[], Integer>> edgeFFlowIterator = edgeFFlow.entrySet().iterator();
		Iterator<Entry<int[], Integer>> edgeBFlowIterator = edgeBFlow.entrySet().iterator();
		
		Entry<int[], Integer> tempB = null;
		Entry<int[], Integer> tempF = null;
		
		int[] tempFFlowEdge;
		int[] tempBFlowEdge;
		int tempFFlow, tempBFlow;
		
		while(edgeFFlowIterator.hasNext())
		{
			tempF = edgeFFlowIterator.next();
			tempFFlowEdge = tempF.getKey();
			tempFFlow = tempF.getValue();
			if(tempFFlowEdge[0]==vertexV && tempFFlowEdge[1]==vertexW)
			{
				/*System.out.println("temp FFlow vertices : "+tempFFlowEdge[0]+" "+tempFFlowEdge[1]);
				System.out.println("temp FFlow value : "+tempFFlow);*/
				break;
			}
		}
		
		while(edgeBFlowIterator.hasNext())
		{
			tempB = edgeBFlowIterator.next();
			tempBFlowEdge = tempB.getKey();
			tempBFlow = tempB.getValue();
			if(tempBFlowEdge[0]==vertexV && tempBFlowEdge[1]==vertexW)
			{
				/*System.out.println("temp BFlow vertices : "+tempBFlowEdge[0]+" "+tempBFlowEdge[1]);
				System.out.println("temp BFlow value : "+tempBFlow);*/
				break;
			}
		}
		
		while(edgeIterator.hasNext())
		{
			Entry<int[], Integer> temp = edgeIterator.next();
			int[] tempEdgeVertices = temp.getKey();
			int tempCapacity = temp.getValue();
			int valueF, valueB = 0;
			if(tempEdgeVertices[0]==vertexV && tempEdgeVertices[1]==vertexW && tempCapacity>0)
			{
				//System.out.println("edge capacity = "+tempCapacity);
				//Set the forward flow = capacity
				for(int j=0;j<excess_height.length;j++)
				{
					if(excess_height[j][0]==vertexV)
					{
						valueF = java.lang.Math.min(tempCapacity, tempF.getValue()+excess_height[j][1]);
						edgeFFlow.put(tempF.getKey(), valueF);
						//System.out.println("Forward flow of edge ("+vertexV+", "+vertexW+") is "+valueF);
						
						//Set backward flow = forward flow - capacity
						//tempB.setValue(tempF.getValue() - tempCapacity);
						
						//if(tempCapacity==0 && excess_height[j][0]>0)
						//{
							valueF = java.lang.Math.max(0,tempF.getValue()-excess_height[j][1]);
							edgeBFlow.put(tempB.getKey(), valueB);
							//System.out.println("Backward flow of edge ("+vertexV+", "+vertexW+") is "+valueB);
						//}
						
						edgeCapacity.put(temp.getKey(), tempCapacity - tempF.getValue());
						//System.out.println("New capacity of edge ("+vertexV+", "+vertexW+") is "+edgeCapacity.get(temp.getKey()));
						
					}
				}
				
				//Set excess of the second node equal to the flow value
				for(int i=0;i<excess_height.length;i++)
				{
					if(excess_height[i][0]==vertexW)
					{
						
						//System.out.println("old excess of "+vertexW+" is "+excess_height[i][2]);
						excess_height[i][1] += tempF.getValue();
						//System.out.println("new excess of "+vertexW+" is "+excess_height[i][1]);
					
					}
					if(excess_height[i][0]==vertexV)
					{
						excess_height[i][1] = excess_height[i][1] - tempF.getValue();
						//System.out.println("new excess of "+vertexV+" is "+excess_height[i][1]);
					}
				}	
			}
		}
		
		return;
	}
	
	public void relabel(int vertexW, int vertexV)
	{
		//System.out.println("in relabel for vertices "+vertexV+" "+vertexW);
		int i;
		for(i=0;i<excess_height.length;i++)
		{
			for(int j=0;j<excess_height.length;j++)
			{
				if(excess_height[i][0]==vertexV && excess_height[j][0]==vertexW && excess_height[i][1] > 0)
				{
					//Relabel by increasing the height of vertex v
					excess_height[i][2] = excess_height[i][2]+1;
					//System.out.println("In relabel for "+vertexV+" and "+vertexW+" and the new height of "+vertexV+" is "+excess_height[i][2]);
					return;
				}
			}
		}
	}
}