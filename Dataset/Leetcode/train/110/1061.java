 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(countHeight(root.left)-countHeight(root.right))>1){
             return false;
        }
        return XXX(root.left)&&XXX(root.right);
    }
    public int countHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int count = Math.max(countHeight(root.left),countHeight(root.right)) + 1;
        // System.out.println(count);
        return count;
    }
}

