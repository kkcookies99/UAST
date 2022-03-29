 class Solution {
    public boolean XXX(TreeNode root) {

        return root==null || XXX(root.left,root.right);
    }

    public boolean XXX(TreeNode east,TreeNode west) {
        if(east == null && west == null){
            return true; //两个都是null
        }else if (east == null || west == null){
            return false;//有一个null
        }
        //都不是null
        return east.val == west.val && XXX(east.right,west.left) && XXX(east.left,west.right) ;
    }
}

