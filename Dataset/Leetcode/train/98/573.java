 class Solution {
    public boolean XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list); // 得到的 list 应该严格单调上升
        int n = list.size();
        if (n == 0) return true;

        int cur = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list.get(i) <= cur) {
                return false; 
            }
            cur = list.get(i);
        }
        return true;
    }
    void dfs(TreeNode root, List<Integer> list) {
        if (root != null) {
            dfs(root.left, list);
            list.add(root.val);
            dfs(root.right, list);
        }
    }
}

