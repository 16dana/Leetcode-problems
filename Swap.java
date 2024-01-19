
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char t1='l';
	    int n=sc.nextInt();
	    char ar[]=new char[n];
	    int i=0;
	    for(i=0;i<n;i++)
	    {
	        ar[i]=sc.next().charAt(0);
	    }
	    
	    int t=sc.nextInt();
	    
	    while(t!=0)
	    {
	        for(i=0;i<n-1;i++)
	        {
	            if(ar[i]=='b'&&ar[i+1]=='g')
	            {
	                t1=ar[i];
	                ar[i]=ar[i+1];
	                ar[i+1]=t1;
	                i=i+1;
	            }
	        }
	        t=t-1;
	    }
	    for(i=0;i<n;i++)
	    {
	        System.out.println(ar[i]);
	    }
	    
	}
}
