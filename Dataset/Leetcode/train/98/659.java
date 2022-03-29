 class Solution {
    long last=Long.MIN_VALUE;
    public boolean XXX(TreeNode root){//判断head为根的树是不是搜索二叉树
        if(root==null) return true;//空树是搜索二叉树
        boolean judge_left= XXX(root.left);//判断左子树是不是搜索二叉树
        if(!judge_left) return false;//左子树不是
        if(!(root.val>last)){//和中序遍历序列的前面一个节点比较，判断是否升序
            return false;
        }
        last=root.val;
        boolean judege_right= XXX(root.right);
        if(!judege_right) return false;
        return true;
    }
}

