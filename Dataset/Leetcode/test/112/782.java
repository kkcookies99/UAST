 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null) return false;
        boolean[] result = {false};
        traverse(root,root.val,result,sum);
        return result[0];
    }
    public void traverse(TreeNode root,int num,boolean[] result,int sum){
        if(root==null) return ;
        if(num==sum && root.left==null && root.right==null){
            result[0] = true;
            return ;
        }
        int l = root.left==null?0:root.left.val;
        int r = root.right==null?0:root.right.val;
        traverse(root.left,num+l,result,sum);
        traverse(root.right,num+r,result,sum);
    }
} 

