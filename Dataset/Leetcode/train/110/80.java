class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return XXX(root.left) && XXX(root.right) && Math.abs(depth(root.left)-depth(root.right))<=1;
    }
    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


