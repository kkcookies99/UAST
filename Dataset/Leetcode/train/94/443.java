     public List<Integer> XXX(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Deque<TreeNode> stk = new LinkedList<>();
        TreeNode t = root;
        while(t != null) {
            stk.push(t);
            t = t.left;
            while(t == null && !stk.isEmpty()) {
                t = stk.pop();
                ans.add(t.val);
                t = t.right;
            }

        }
        return ans;
    }

