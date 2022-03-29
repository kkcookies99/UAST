class Solution {
    public int XXX(TreeNode root) {
        int ans = getDepth(root);

        return ans;
    }

    public int getDepth(TreeNode node){
        if(node == null){  
            return 0;
        }

        int leftDepth = getDepth(node.left);  // 左
        int rightDepth = getDepth(node.right);  // 右

        // 根
        if(node.left == null && node.right != null){
            return 1 + rightDepth;
        }

        if(node.left != null && node.right == null){
            return 1 + leftDepth;
        }

        return 1 + Math.min(leftDepth, rightDepth);
    }
}

