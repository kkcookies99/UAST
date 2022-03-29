class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        int maxleft=XXX(root.left);
        int maxright=XXX(root.right); 
        return (maxleft>maxright ? maxleft : maxright)+1;     
    }
}

