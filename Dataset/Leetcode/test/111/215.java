class Solution {
    public int XXX(TreeNode root) {
        int XXX = 0;
        if(root == null){
            return 0;
        }    
        if(root.left != null && root.right != null){
            return 1 + Math.min(XXX(root.left), XXX(root.right));
        }  
        else if(root.left != null){
            return 1 + XXX(root.left);
        }
        else if(root.right != null){
            return 1 + XXX(root.right);
        }else{
            return 1;
        }
    }
}

