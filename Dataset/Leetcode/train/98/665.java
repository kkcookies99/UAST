 class Solution {
    TreeNode R;

    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        boolean b = XXX(root.left);
        b &= R == null || R.val < root.val;
        R = root;
        b &= XXX(root.right);
        return b; 
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


