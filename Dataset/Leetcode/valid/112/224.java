 public boolean XXX(TreeNode root, int targetSum) {

    //空根节点直接false
    if(root==null){
        return false;
    }
    //当根为唯一节点
    if(root.left==null && root.right==null){
        //相等则true 不等则false
        if (root.val==targetSum){
            return true;
        }else{
            return false;
        }
    }
    //上述都不满足则为非空非叶子节点，则递归调用左右子树，有一颗子树满足则返回true
    if(XXX(root.left,targetSum-root.val) || XXX(root.right,targetSum-root.val)){
        return true;
    }
    return false;
}

