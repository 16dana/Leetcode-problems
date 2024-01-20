class Solution {

    
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)
        {
            prev.next=null;
        }
        else
        {
            return new TreeNode(slow.val);
        }
        TreeNode root=new TreeNode(slow.val);
        root.left= sortedListToBST(head);
        root.right= sortedListToBST(slow.next);
        return root;

    }
}
