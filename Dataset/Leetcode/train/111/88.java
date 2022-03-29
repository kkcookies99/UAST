class Solution {
    public int XXX(TreeNode root) {
        if(root==null)  return 0;
        int l =XXX(root.left);
        int r =XXX(root.right);
        if(l==0 ||r==0)
            return l+r+1;//在左子树和右子树中仅有一个存在的情况下，返回存在的值（即其中一颗树的XXX为0）
        return Math.min(l,r)+1;//在左子树和右子树都存在的情况下返回两者最小值
    }
}

