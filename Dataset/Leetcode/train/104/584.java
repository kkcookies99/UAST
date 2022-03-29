class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int res = 1;
        if(root.left==null&&root.right==null){
            return res;
        }else{
            res =  Math.max(XXX(root.left),XXX(root.right))+1;
        }
        return res;
    }
}

