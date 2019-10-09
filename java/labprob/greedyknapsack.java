import java.util.*;
class greedyknapsack
{
	int findmax(int a[] , int n)
	{
		int i,pos=0,mx=0;
		for(i=0;i<n;i++)
		{
			if(a[i] > mx )
			{
				mx = a[i];
				pos = i;
			}
		}
		return pos;
	}
	//now i have all the needed values 
	void solve(int w[] , int val[] , int wt , int n)
	{
		int index,ans=0,i;
		while(wt!=0)
		{
			index = findmax(val,n);
			if(w[index] > wt)
				val[index] = -1;
			else
			{
				wt -=w[index];
				ans += val[index];
				val[index]=-1;
			}
		/*	for(i=0; i<n; i++)
			{
				if(val[i]!=-1)
					break;
			}
			if(i==n)
				break;
		*/
		}
                System.out.println("the result of max profit :" +ans);
	}
	public static void main(String args[])
	{
		//now in knapsack 0/1
		Scanner sc = new Scanner(System.in);
		greedyknapsack ks = new greedyknapsack();
		System.out.println("enter the number of elements\n");
		int n = sc.nextInt();
		int i;
		int w[] = new int[n];
		int val[] = new int[n];
                System.out.println("enter the wieght and val respectively \n");
		for(i=0; i<n; i++)
		{
			w[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
                System.out.println("enter the knapsack capacity\n");
		int wt = sc.nextInt();
		ks.solve(w,val,wt,n);
	}
}
