    public int XXX(TreeNode root) {
    	if(root==null) return 0;
    	int left,right;
    	left = XXX(root.left);
    	right= XXX(root.right);
    	
    	if(left!=0 && right!=0)
    		return (left>right?right:left)+1;
    	else
    		return (left>right?left:right)+1;
    }

