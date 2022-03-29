class Solution {
    public int XXX(TreeNode root) {
        return minD(root,0);
    }
    public int minD(TreeNode root,int depth){
        if(root==null) return depth;
        if(root.left!=null && root.right!=null) return Math.min(minD(root.left,depth+1),minD(root.right,depth+1)); 
        else if(root.left==null && root.right!=null) return minD(root.right,depth+1);
        else if(root.left==null && root.right==null) return depth+1;
        else return minD(root.left,depth+1);
    }
}

