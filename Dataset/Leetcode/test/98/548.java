 class Solution {
    public boolean XXX(TreeNode root) {
    		boolean pd=true;
    		if(root.left!=null)
    			pd=(root.val>max(root.left))&&(XXX(root.left));
    		if(root.right!=null)
    			pd=pd&&(root.val<min(root.right))&&(XXX(root.right));
    		return pd;
    }
    public int max(TreeNode root)
    {
    	if(root.right!=null)
    		return max(root.right);
    	else
    		return root.val;
    }
    public int min(TreeNode root)
    {
    	if(root.left!=null)
    		return min(root.left);
    	else
    		return root.val;
    }
}

