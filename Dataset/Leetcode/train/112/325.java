 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int sum, int target) {
        if (node == null) {
            return false;
        }

        sum += node.val;
        if (node.left == null && node.right == null) {
            return sum == target;
        }

        return dfs(node.left, sum, target) || dfs(node.right, sum, target);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


