 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
    	//特殊情况
        if(p==null&&q==null) return true;
    	if(p==null&&q!=null||p!=null&&q==null) return false;
    	
    	//一般情况
    	return p.val==q.val&&XXX(p.left, q.left)&&XXX(p.right, q.right);
    }
}

