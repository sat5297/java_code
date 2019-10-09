import java.util.*;

class minst 
{
	int n;
	int a[][];
	int parent[];
	minst()
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of vertices");
                n = sc.nextInt();
		a[][] = new int[n][n];
		System.out.println("enter the adjacency matrix");
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		parent[] = new int[n];
		for()
		//now we have the adjacency matrix
		sc.close();
		//now we have the adjacency matrix and we have to perform kruskals 
	}	
	void krus()
	{
		int i,j,k=0,cost=0,min,u=0,v=0;
		while(k!=n-1)
		{
			min = 99;
			//pick smallest edge and then mark it as occupied by making its wt 99
			for(i=0; i<n; i++)
			{
				for(j=0; j<n; j++)
				{
					if(a[i][j] >0 && a[i][j] < min)
					{
						min = a[i][j];
						u = i;
						v = j;
					}
				}
			}
			//now we have the min edge 
			i = root(u);
			j = root(v);
		}
		
	}
	public static void main(String args[])
	{
		minst ks = new minst();
		ks.krus();
	}
}
