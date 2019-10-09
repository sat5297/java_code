import java.util.*;
class dijkstra
{
	int d[] = new int[5];           //store cumulative distances from the source
        int p[] = new int[5];           //to store path
        int visited[] = new int[5];	//to keep check if a node is visited or not
	
	int nearestEdge(int u,int n,int d[] , int visited[])
	{
		int min = 99;
		int min_index = u;
		int i;
		for(i=0;i<n;i++)
		{
			if(min > d[i] && visited[i]==0)
			{
				min = d[i];
				min_index = i;
			}
		}	
		return min_index;
	}
		
		
	void dijk( int a[][] , int src , int n)		//n - number of vertices 
	{
		//now i will find the nearest vertex to the source 
		int u=-1,v,i,j,min;
		for(v=0;v<n;v++)
		{
			d[v] = Integer.MAX_VALUE;		//999
			p[v] = -1;				//every path to -1
		}
		d[src] = 0;
		for(i = 0 ; i<n; i++)		//i has no use inside this loop it is just that we want to run the loop this many times 
		{
			u = nearestEdge(u,n,d,visited);
			visited[u] = 1;
			//now with respect to u update all the values 
			for(v=0; v<n; v++)
			{
				//now for this value of u i need to minimize 
				if( d[u] + a[u][v] < d[v] && u!=v && visited[i]==0 )
				{
					d[v] = d[u] + a[u][v];
					p[v] = u;	
					//we are going from u-th vertex to v-th vertex 
				}
			}
		}
	}
	void path(int v ,int src)
	{
		if(p[v]!=-1)
			path(p[v] , src);
		if(v!=src)
			System.out.print("->" + v + " ");
	}
	void display(int src , int n)
	{
		int i;
		for(i=0; i<n; i++)
		{
			if(i!=src)
			{
				System.out.println(src + " " );
				path(i,src);
				System.out.println(" = " + d[i]);
			}
		}
	}

	public static void sout(String s)
	{
		System.out.println(s);
	}
	public static void main(String args[])
	{
		int i,n,j;
		sout("enter the number of vertices\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[][] = new int[n][n];
		//now we have created the adjacency matrix take inputs now 
		sout("enter the adjacency matrix values\n");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		sout("enter the source \n");
		int src = sc.nextInt();
		//now i have the source also and my prog should calc the shortest path to every vertex of the graph
		dijkstra dj = new dijkstra();
		dj.dijk(a,src,n);		//to find shortest paths and do relaxation
		System.out.println("the shortest path from "+ src +" to every vertex is :\n");
		dj.display(src,n);
		sc.close();		//close the scanner 	
	}

}
