class Solution {
    public int XXX(TreeNode root) {
        int i=1,j=1;
        if(root==null) return 0;
        if(root.left!=null) {    
             i = XXX(root.left)+1;  
        } 
        if(root.right!=null) {   
            j = XXX(root.right)+1;
        }
        return i>j?i:j;
    }
}

