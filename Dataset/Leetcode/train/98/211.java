     public boolean XXX(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        boolean gtLeftLargest = true;
        if (root.left != null)
            gtLeftLargest = root.val > findLeftLargest(root.left);

        boolean ltRightSmallest = true;
        if (root.right != null)
            ltRightSmallest = root.val < findRightSmallest(root.right);

        return gtLeftLargest && ltRightSmallest && XXX(root.left) && XXX(root.right);
    }

    private int findRightSmallest(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node.val;
    }

    private int findLeftLargest(TreeNode node) {
        while (node.right != null)
            node = node.right;
        return node.val;
    }

