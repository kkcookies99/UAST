class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        // System.out.println(length(root));
        if((Math.abs(length(root.left)-length(root.right))) > 1){
            return false;
        }
        
        return XXX(root.left) && XXX(root.right);
    }

    public int length(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftLength = length(root.left)+1;
        int rightLength = length(root.right)+1;
        int len = Math.max(leftLength,rightLength);
        return len;
    }
}

