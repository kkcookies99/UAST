 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root!=null)
            que.add(root);
           
        while(!que.isEmpty())
        {
            TreeNode temp = que.peek();
             if(temp.left==null&&temp.right==null&&temp.val==sum)
            return true;
            if(temp.left!=null){
                temp.left.val += temp.val;
                que.add(temp.left);
            }
             if(temp.right!=null){
                temp.right.val += temp.val;
                que.add(temp.right);
            }
            que.poll();
        }
        return false;
    }
}

