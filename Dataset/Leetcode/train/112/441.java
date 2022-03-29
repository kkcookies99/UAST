 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null) return false;
        return path(root, sum, 0);
    }
    public boolean path(TreeNode root, int sum, int temp){
        if(root==null) return false; //只有左边or右边一个子树
        temp+=root.val;
        if(root.left == null && root.right==null)  return (temp==sum)?true:false;
        return path(root.left, sum, temp)||path(root.right, sum, temp);
    }
}

