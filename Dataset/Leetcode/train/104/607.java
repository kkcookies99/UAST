 class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count;
        int depthLeft;//从根节点往左遍历
        int depthRight;
        depthLeft=XXX(root.left)+1;
        depthRight=XXX(root.right)+1;
        return Math.max(depthLeft,depthRight);
        
    }
}

