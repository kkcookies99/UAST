 class Solution {
    public static final int[] t = new int[2];

    public boolean XXX(TreeNode root) {
        if (fun(root) == t) return false;
        return true;
    }

    //以root为根的子树的所有结点取值范围{min, max}
    public int[] fun(TreeNode root) {
        if (root == null) return null;
        
        //临近满足条件
        if ((root.left != null && root.left.val >= root.val) ||
            (root.right != null && root.right.val <= root.val))
            return t;

        int[] l = fun(root.left);
        int[] r = fun(root.right);

        if (l == t || r == t) return t;//子树不满足条件
        if (l==r && l==null) return new int[]{root.val, root.val};//左右皆空

        //保证左节点 > 左子树,右节点 < 右子树
        if ((l!=null && l[1] >= root.val) || (r!=null && r[0] <= root.val)) 
            return t;
        
        return new int[]{l==null?root.val:l[0], r==null?root.val:r[1]};
    }

}

