 class Solution {
    long pre=Long.MIN_VALUE;//上一节点的值:用long存就不用单独判断root.val=Integer.MIN的情况啦
    public boolean XXX(TreeNode root) {
        //中序遍历：遍历到的节点应该严格递增
        if(root==null) return true;

        if(!XXX(root.left)){
            return false;
        }
        if(pre>=root.val){
            return false;
        }
        pre=root.val;
        if(!XXX(root.right)){
            return false;
        }
        return true;
    }
}

