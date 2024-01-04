import java.util.*;
public class Main
{
    static int dp[]=new int[53];
    static int fib(int n)
    {
        if(n==1)
        {
	        return 0;
	    }
	    if(n==2)
	    {
	        return 1;
	    }
	    if(dp[n] != -1)
	    {
	        return dp[n];
	    }
	    
	    dp[n]=fib(n-1)+fib(n-2);
	    return dp[n];
    }
	public static void main(String[] args) {
	    Arrays.fill(dp,-1);
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
		System.out.println(fib(l));
	}
}
