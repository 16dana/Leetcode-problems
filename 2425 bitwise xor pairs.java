class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int i=0,j=0,c=0;
        
        if(nums2.length%2!=0)
        {
            for(i=0;i<nums1.length;i++)
            {
                c^=nums1[i];
            }
        }
        if(nums1.length%2!=0)
        {
            for(i=0;i<nums2.length;i++)
            {
                c^=nums2[i];
            }
        }
        return c;
    
    }
}
