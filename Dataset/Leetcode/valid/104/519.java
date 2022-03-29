public int XXX(TreeNode root) {
        if(root == null) return 0;
        int leftDeepest = XXX(root.left);
        int rightDeepest = XXX(root.right);
        return leftDeepest > rightDeepest ? leftDeepest+1 : rightDeepest+1;
    }

