class Solution {
    int iot(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        int l=0;
        int i=0;
        int max=Integer.MIN_VALUE;
       
        int res=0;
        q.add(root);
        while(!q.isEmpty())
        {
            l++;
             int sum=0;
             int len=q.size();
            for(i=0;i<len;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
                sum+=cur.val;

            }
            if(max<sum)
            {
                max=sum;
                res=l;
            }
            
        }
        return res;

    }
    public int maxLevelSum(TreeNode root) {

        return iot(root);
    }
}
