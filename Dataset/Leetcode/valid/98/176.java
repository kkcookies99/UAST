 class Solution {
    //中序遍历，如果是二叉搜索树，中序遍历结果应该是升序排列
    //XXX(root.left)  不满足返回false
    //.....................  将当前访问的节点与上一节点比较，小于等于上一节点值返回false
    //XXX(root.right) 不满足返回false
    long last = Long.MIN_VALUE;//记录上一个访问的节点值
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(!XXX(root.left)) return false;
        if(root.val <= last) return false;
        last = root.val;        
        if(!XXX(root.right)) return false;
        return true;
    }
}

