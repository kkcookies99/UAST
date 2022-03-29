 public boolean XXX(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !s.isEmpty()) {
            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = s.pop();
                if (pre != null && pre.val >= top.val) {
                    return false;
                }
                pre = top;
                cur = top.right;
            }
        }
        return true;

    }

