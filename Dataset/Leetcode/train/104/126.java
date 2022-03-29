class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(XXX(root.left), XXX(root.right)) + 1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


