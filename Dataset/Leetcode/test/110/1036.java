 public boolean XXX(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1)
            return false;
        else
        {
            if(XXX(root.left) && XXX(root.right))
            {
                return true;
            }
            else return false;
        }
    } 
    
    
    
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root==null) return 0;
        int ans=0;
        q.add(root);
        
        while(!q.isEmpty())
        {
            ans++;
            int len = q.size();
            while(len>0)
            {
                TreeNode n = q.poll();
                if(n.left!=null)
                {
                    q.add(n.left);
                }
                if(n.right!=null)
                {
                    q.add(n.right);
                }
                len--;
            }
        }
        return ans;
    }
}

