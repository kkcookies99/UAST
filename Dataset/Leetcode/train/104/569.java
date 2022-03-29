class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        return Math.max(root.left != null ? XXX(root.left): 0,
                    root.right != null ? XXX(root.right):0)+1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


