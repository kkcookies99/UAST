class Solution {
    public boolean XXX(TreeNode root) {
        return caculateDeep(root)>=0;
    }

    public int caculateDeep(TreeNode root){
        if(root==null)
            return 0;
        int left = caculateDeep(root.left);
        int right = caculateDeep(root.right);
        return  left>=0 && right>=0 && Math.abs(left-right)<=1 ? 1 + Math.max(left,right) : -1;
    }

}

