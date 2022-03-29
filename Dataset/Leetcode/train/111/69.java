class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right != null) return 1 + XXX(root.right);
        if(root.left != null && root.right == null) return 1 + XXX(root.left);
        return 1 + Math.min(XXX(root.left),XXX(root.right));
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


