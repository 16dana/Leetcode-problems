class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int l=arr1.length;
        int m=arr2.length;
        int t1=0;
        int t=0;
        for(int i=0;i<l;i++)
        {
            t=t^arr1[i];
        }
        for(int j=0;j<m;j++)
        {
            t1=t1^arr2[j];
        }
        return t&t1;
    }
}
