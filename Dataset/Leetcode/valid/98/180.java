     public boolean XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return isValid(root, list);
    }
    private boolean isValid(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            if (!isValid(root.left, list)) {
                return false;
            }
        }
        if (list.size() != 0 && root.val <= list.get(list.size() - 1)) {
            return false;
        }
        list.add(root.val);
        if (root.right != null) {
            return isValid(root.right, list);
        }
        return true;
    }

