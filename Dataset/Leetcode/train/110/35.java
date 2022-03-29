class Solution {
    public boolean XXX(TreeNode root) {
        return high(root) >= 0?true:false;
    }
    public int high(TreeNode root) {
        if(root == null)
            return 0;//当前子树是空
        int l = high(root.left);
        int r = high(root.right);
        if(l == -1 || r == -1){
            return -1;//表明已经不是高度平衡二叉树了
        }
        int h = Math.abs(l - r);
        if(h ==0 || h ==1)
            return l >= r?l+1 : r+1;//返回的高度等于当前子树最大高度+1
        else
            return -1;
    }
}

