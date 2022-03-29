 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.offer(root.left);
        right.offer(root.right);
        while(!left.isEmpty() || !right.isEmpty()){
            TreeNode nodeLeft = left.poll();
            TreeNode nodeRight = right.poll();
            if(nodeLeft == null && nodeRight == null){
                continue;
            }
            if(nodeLeft == null || nodeRight == null || nodeLeft.val != nodeRight.val){
                return false;
            }
            left.offer(nodeLeft.left);
            left.offer(nodeLeft.right);
            right.offer(nodeRight.right);
            right.offer(nodeRight.left);
        }

        return true;
    }
}

