class Solution {
    public int XXX(TreeNode root) {
        if(root==null){ return 0; }
        // 必须要左右子节点都为空才是叶子节点，别被坑了 = =
        if(root.left==null || root.right==null){
            return 1+(root.left==null?XXX(root.right):XXX(root.left));
        }
        return Math.min(XXX(root.left),XXX(root.right))+1;
    }
}

