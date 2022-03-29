 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;

        boolean left = XXX(root.left);
        boolean right = XXX(root.right);

        if(!left || !right) return false;

        if(root.left!=null && root.val <= max(root.left)) return false;
        if(root.right!=null && root.val >= min(root.right)) return false;

        return true;
    }

    int min(TreeNode root) {
        while(root.left!=null) {
            root = root.left;
        }
        return root.val;
    }

    int max(TreeNode root) {
        while(root.right!=null) {
            root = root.right;
        }
        return root.val;
    }
}

