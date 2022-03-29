class Solution {
    public boolean XXX(TreeNode root) {
        return getDepth(root) == -1 ? false : true;
    }

    //首要明确递归函数的功能：求传入节点为根节点的树的高度，如果树是不平衡树，则返回-1
    public int getDepth(TreeNode root) {
        //终止条件
        if (root == null) {
            return 0;
        }

        //递归函数单层逻辑：递归函数的功能透明化
        int leftDepth = getDepth(root.left);
        if (leftDepth == -1) { //左子树已是不平衡树，没必要继续计算，直接返回判断结果
            return -1;
        }
        int rightDepth = getDepth(root.right);
        if (rightDepth == -1) { //右子树已是不平衡树，同上
            return -1;
        }
        //对当前节点为根节点的树做一个总结处理
        return Math.abs(leftDepth - rightDepth) > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;

    }
    
}

