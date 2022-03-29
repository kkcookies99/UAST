     public boolean XXX(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode root, long min, long max) { // 递归的时候使用一个最大值最小值
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) { //进行判断
            return false;
        } // 左边吧最大值设置为root  右边吧最小值设置为root
        return valid(root.left, min, root.val) && valid(root.right, root.val, max);
    }

