 class Solution {
    long pre = Integer.MIN_VALUE;
    boolean init = false;

    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(!XXX(root.left) || (init && root.val <= pre)) return false;
        pre = root.val;
        init = true;
        return XXX(root.right);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


