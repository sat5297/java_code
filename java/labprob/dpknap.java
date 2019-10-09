import java.util.*;
class dpknap
{
	void solve(int w[] , int val[] , int wt , int n)
	{
		int i,j;
		int dp[][] = new int[n+1][wt+1];
		for(i=0;i<=n;i++)
			dp[i][0] = 0;
	        for(j=0;j<=wt;j++)
			dp[0][j] = 0; 
		//initialization done
		//i - slot , j - to iterate through the max wt that can be selected
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=wt; j++)
			{
				if( w[i] > j )
					dp[i][j] = dp[i-1][j];
				else 
					dp[i][j] = Math.max( dp[i-1][j] , val[i] + dp[i-1][j-w[i]]);
			}
		}
		//now if we want to trace the path
		//we can print the matrix output 
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=wt;j++)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
                System.out.println("the result of max profit :" + dp[n][wt]);
		i=n;j=wt;
		while(i>0 && j>0)
		{
			if(dp[i-1][j] != dp[i][j])
			{
				//means that the j-th element is included
				System.out.println(w[i]);	
				j -= w[i];
			}
			else
				i--;
		}
	}
	public static void main(String args[])
	{
		//knapsack 0/1
		Scanner sc = new Scanner(System.in);
		dpknap ks = new dpknap();
		System.out.println("enter the number of elements\n");
		int n = sc.nextInt();
		int i;
		int w[] = new int[n+1];
		int val[] = new int[n+1];
                System.out.println("enter the wieght and val respectively \n");
		w[0]=0; val[0] = 0;
		for(i=1; i<=n; i++)
		{
			w[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
                System.out.println("enter the knapsack capacity\n");
		int wt = sc.nextInt();
		ks.solve(w,val,wt,n);
	}
}
