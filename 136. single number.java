class Solution {
    public int singleNumber(int[] nums) 
    {
        int i,t=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])
            {
                t=nums[i];
                return t;
            }
        }
        return nums[nums.length-1];
    }
}
