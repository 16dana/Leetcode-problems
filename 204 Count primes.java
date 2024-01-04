class Solution {
    public int countPrimes(int n) {
        int ar[]=new int[n];
        int i,j,co=0;
        if(n<=1){
            return 0;
        }
        for(i=0;i<n;i++)
        {
            ar[i]=1;
        }
        ar[0]=1;
        ar[1]=1;
        for(i=2;i<n;i++)
        {
            for(j=i*2;j<n;j=j+i)
            {
                ar[j]=0;
            }
        }
        for(i=2;i<n;i++)
        {
            if(ar[i]==1){
                co++;
            }
        }
        return co;
    }
}
