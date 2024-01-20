class Solution {
    TreeNode solve(int[] nums,int s,int e)
    {
        if(s>e)
        {
            return null;

        }
        int m=(s+e)/2;
        TreeNode root=new TreeNode(nums[m]);
        root.left=solve(nums,s,m-1);
        root.right=solve(nums,m+1,e);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums,0,nums.length-1);

    }
}
