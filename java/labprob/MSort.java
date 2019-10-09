import java.*;
import java.io.*;
import java.util.*;
class MSort{
	static int MAX_SIZE=150000;
	static int[] a=new int[MAX_SIZE];
	static String s=null;
	public void readRandomArray(int a[],int n){
		Random rand = new Random();
		for(int i=0;i<n;i++){
			a[i]=rand.nextInt();
		}
	}
	public void plotGraph(int a[]) throws IOException{
		File file = new File("plot.txt");
		FileWriter wr = new FileWriter(file);
		BufferedWriter buf = new BufferedWriter(wr);
		buf.write("TitleText: Sort Algorithm Analysis\n");
		buf.write("XUnitText: Problem Size\n");
		buf.write("YUnitText: Time taken in sec\n");
		for(int i=100;i<MAX_SIZE;i+=100){
			readRandomArray(a,i);
			double timeBefore=System.currentTimeMillis();
			sortArray(a,i);
			double timeAfter=System.currentTimeMillis();
			double timeSpent=(timeAfter-timeBefore)/1000;
			buf.write(i+" "+timeSpent+"\n");
		}
		buf.close();
		Process p = Runtime.getRuntime().exec("xgraph plot.txt");
		BufferedReader buf1=new BufferedReader(new InputStreamReader(p.getInputStream()));
		while((s=buf1.readLine())!=null)
			sout(s+"\n");
		buf1.close();
	}
	public static void sout(String a){
		System.out.print(a);
	}
	public void sortArray(int[] a, int n){
		mergeSort(a,0,n-1);
	}
	private void mergeSort(int[] a,int l,int h){
		if(l>=h)
			return;
		int n=h-l+1;
		int[] b;int[] c;
		int bSize=n/2;
		int cSize = n - bSize;
		b = new int[bSize];
		c = new int[cSize];
		copy(a,b,0,n/2-1);
		copy(a,c,n/2,n-1);
		mergeSort(b,0,bSize-1);
		mergeSort(c,0,cSize-1);
		merge(b,c,a,bSize,cSize);	
	}
	private void copy(int[] a, int[] b,int l,int h){
		int i,j;
		for(i=l,j=0;i<=h;i++,j++)
			b[j]=a[i];
	}
	private void merge(int[] b,int[] c,int[] a,int bSize,int cSize){
		int i,j,k;
		i=j=k=0;
		while(i<bSize && j<cSize){
			if(b[i]<=c[j])
				a[k++]=b[i++];
			else
				a[k++]=c[j++];
		}
		while(j<cSize)
			a[k++]=c[j++];
		while(i<bSize)
			a[k++]=b[i++];
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Sort demo = new Sort();
		sout("\n1.Plot Graph\n2.Check merge sort\nChoice:\t");
		int ch=sc.nextInt();
		if(ch==1){
			try{
				demo.plotGraph(a);
			}catch(Exception e){

			}
		}else if(ch==2){
			sout("\nArray Size:\t");
			int n=sc.nextInt();
			int[] arr = new int[n];
			demo.readRandomArray(arr,n);
			for(int i=0;i<n;i++)
				arr[i]/=1000;
			sout("\n\nBefore Sorting:\n\n");
			for(int i=0;i<n;i++)
				sout(arr[i]+"  ");
			demo.sortArray(arr,n);
			sout("\n\nAfter Sorting:\n\n");
			for(int i=0;i<n;i++)
				sout(arr[i]+"  ");
			
		}
	}
}


































