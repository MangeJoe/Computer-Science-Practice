import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
	
    int Nodes;
	int Edges;
	
	 LinkedList<Integer>[] al;
	
	public Graph(int nodes) {
		this.Nodes=nodes;
		Edges=0;
		al=new LinkedList[nodes];
		
		for(int i=0;i<Nodes;i++) {
			al[i]=new LinkedList<>();
		}
		
	}

	
	void addEdge(int r,int c) {
		this.al[r].add(c);
		this.al[c].add(r);
		Edges++;
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<Nodes;i++) {
			sb.append(i +" --> ");
			for(int c=0;c<al[i].size();c++) {
				sb.append(al[i].get(c)+ " -->");
				
			}
			sb.append('\n');
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph=new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		
		System.out.println(graph);
	}

}
