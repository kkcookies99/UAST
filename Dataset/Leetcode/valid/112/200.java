 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        HashSet<Integer> set = new HashSet();
        int sum = 0;
        boolean flag = root.left == null && root.right == null;
        set = dfs(root, set, sum, flag);
        return set.contains(targetSum);
    }

    public HashSet<Integer> dfs(TreeNode root, HashSet<Integer> set, int sum, boolean flag) {
        if (root == null) {
            if (flag)
                set.add(sum);
            return set;
        }
        sum += root.val;
        flag = root.left == null && root.right == null;
        set = dfs(root.left, set, sum, flag);
        set = dfs(root.right, set, sum, flag);
        return set;
    }

}

