class Solution {
    ArrayList<Integer> res=new ArrayList<>();

   void inorder(TreeNode root)
    {
        if(root==null)
        {
            return ;

        }
        else
        {
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);
            
        }
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        int i=0;
        for(i=1;i<res.size();i++)
        {
            if(res.get(i)<=res.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}
