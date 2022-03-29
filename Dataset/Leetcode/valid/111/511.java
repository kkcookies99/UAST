class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = XXX(root.left);
        int rightDepth = XXX(root.right);
        if (root.left == null || root.right == null) {
            return leftDepth + rightDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


