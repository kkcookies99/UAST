 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        LinkedList<Boolean> ans = new LinkedList<>();
        ans.add(true);
        recursive(p, q, ans);
        return ans.getFirst();
    }

    public void recursive(TreeNode treeNode1, TreeNode treeNode2, LinkedList<Boolean> ans) {
        if (treeNode1 != null && treeNode2 != null && treeNode1.val == treeNode2.val) {
            recursive(treeNode1.left, treeNode2.left, ans);
            if (ans.getFirst()) {
                recursive(treeNode1.right, treeNode2.right, ans);
            }
        } else if ((treeNode1 != null || treeNode2 != null)) {
            ans.set(0, false);
        }
    }
}

