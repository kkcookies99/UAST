 class Solution {
   boolean lRes=true;
	boolean rRes=true;
    public boolean XXX(TreeNode root) {
    	if(root==null) return true;
    	return other(root,null,null);
    }
	public boolean other(TreeNode root,Integer low,Integer high) {
		if(root==null) { return true;}
		if(low!=null&&root.val<=low) return false;
		if(high!=null&&root.val>=high) return false;
		
		//	lRes = other(root.left,low,root.val); 
		if(!other(root.left,low,root.val))return false;
		//     rRes = other(root.right,root.val,high);
		if(!other(root.right,root.val,high))return false;
                 //return lRes&&rRes;
		return true;
		
	}
}

