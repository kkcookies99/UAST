class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.abs(l-r) < 2 && XXX(root.left) && XXX(root.right);
    }

    //求最大高度
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


