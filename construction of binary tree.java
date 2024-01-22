class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int g=0;
    
    TreeNode consbin(int f,int l,int[] p,int[] in)
    {
        if(f>l)
        {
            return null ;
        }
        int curr=p[g];

        g++;
        int m=map.get(curr);   
        TreeNode root=new TreeNode(curr);          
        root.left=consbin(f,m-1,p,in);
        root.right=consbin(m+1,l,p,in);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     
        for(int i=0;i<preorder.length;i++)
        {
            map.put(inorder[i],i);
        }


        return consbin(0,inorder.length-1,preorder,inorder);
    }
}
