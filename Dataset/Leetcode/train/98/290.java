 class Solution {
    // 二叉搜索树，先想中序遍历
    // 二叉搜索树中不能有重复数字！！！
    // 递归+临时变量
    private TreeNode preNode;

    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }

        boolean left = XXX(root.left);

        if(preNode == null){
            preNode = root;
        }else{
            if(preNode.val >= root.val){
                return false;
            }
            preNode = root;
        }

        boolean right = XXX(root.right);

        return left && right;
        
    }
}

