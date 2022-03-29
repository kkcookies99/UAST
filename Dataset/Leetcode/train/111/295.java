public int XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int depth = 0;
        dfs(root, list, depth);
        int res = Integer.MAX_VALUE;
        for (int num : list) {
            res = Math.min(num, res);
        }
        return res;
    }
    public void dfs(TreeNode root, List<Integer> list, int depth) {
        if (root == null) {
            if (depth == 0) {
                list.add(0);
            }
            return;
        }
        depth++;
        if (root.left == null && root.right == null) {
            list.add(depth);
        }
        dfs(root.left, list, depth);
        dfs(root.right, list, depth);
    }

