 class Solution {
    private TreeNode preNode = null;
    private TreeNode curNode = null;
    private boolean isSearchTree = true;
    
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        //中序遍历的同时查看元素是否处于升序状态
        judgeNode(root);
        return isSearchTree;
    }
    
    public void judgeNode(TreeNode node){
        if(!isSearchTree){
            //已判断非搜索树直接返回
            return;
        }
        if(node.left != null){
            judgeNode(node.left);
        }
        //比较当前Node针对preNode是否升序
        TreeNode tempNode = curNode;
        curNode = node;
        preNode = tempNode;
        if(preNode != null && preNode.val >= curNode.val){
            isSearchTree = false;
        }
        if(node.right != null){
            judgeNode(node.right);
        }
    }
}

