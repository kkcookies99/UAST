class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> myQueue=new LinkedList<>();
        if(root==null)
            return 0;
        myQueue.add(root);
        int minDep=0;
        while(!myQueue.isEmpty())
        {
            int count=myQueue.size();
            minDep+=1;
            while(count>0)
            {
                TreeNode node=myQueue.poll();
                if(node.left==null&&node.right==null)
                    return minDep;
                if(node.left!=null)
                    myQueue.add(node.left);
                if(node.right!=null)
                    myQueue.add(node.right);
                count--;
            }                    
       }
        return minDep;
    }
}

