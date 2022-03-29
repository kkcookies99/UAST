class Solution {
    public int XXX(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root){
        if (root==null) return 0;
        int XXX = 0;
        if (root.left!=null) XXX = Math.max(dfs(root.left), XXX);
        if (root.right!=null) XXX = Math.max(dfs(root.right), XXX);
        return 1 + XXX;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


