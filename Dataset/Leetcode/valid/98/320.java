     public boolean XXX(TreeNode root) {
        if (root == null) return false;
        return XXX1(root);
    }
    private boolean XXX1(TreeNode root) {
        boolean bl = true;
        boolean br = true;
        if (root.left != null) {
            TreeNode node = root.left;
            while (node.right != null) {    //直接找到root节点的左节点下的 最右节点, 与root的值比较
                node = node.right;
            }
            bl = (root.left.val < root.val) && (node.val < root.val) && XXX1(root.left);
        }
        if (root.right != null) {
            TreeNode node = root.right;
            while (node.left != null) {     //直接找到root节点的右节点下的 最左节点, 与root的值比较
                node = node.left;
            }
            br = (root.right.val > root.val) && (node.val > root.val) && XXX1(root.right);
        }
        return bl & br;
    }

