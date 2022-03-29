     public boolean XXX(TreeNode root) {
        if (root == null) return true;
        /**
         * 中序遍历,判断节点值是否为递增
         */
        Stack<TreeNode> stack = new Stack<>();
        TreeNode top = root;
        stack.push(top);
        TreeNode preNode = null;
        while (!stack.isEmpty()){
            top = stack.pop();
            if (top != null){
                if (top.right != null) stack.push(top.right);
                stack.push(top);
                stack.push(null);
                if (top.left != null) stack.push(top.left);
            } else {
                // 回溯阶段
                top = stack.pop();
                if (preNode != null && preNode.val >= top.val) return false;
                preNode = top;
            }
        }
        return true;
    }

