class Solution {
    public int XXX(TreeNode root) {
        if(root==null)return 0;
        return find(root,0);
    }
    public int find(TreeNode root,int depth){
        if(root==null)return depth;
        return Math.max(find(root.left,depth+1),find(root.right,depth+1));
    }
}

