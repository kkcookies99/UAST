 class Solution {
    //使用变量跟踪中序遍历的上一个节点的值
    Integer pre;
    public boolean XXX(TreeNode root) {
        boolean res=true;
        if(root!=null)
        {
            if(root.left!=null)
            {
                if(pre!=null && pre>=root.left.val)
                {
                    return false;
                }
                res=XXX(root.left);
            }
            if(res && pre!=null && pre>=root.val)
            {
                return false;
            }
            pre=root.val;
            if(res && root.right!=null)
            {
                if(pre!=null && pre>=root.right.val)
                {
                    return false;
                }
                res=XXX(root.right);
            }
        }
        return res;
    }
}

