 class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = XXX(root.left);
        int right = XXX(root.right);
        if(left == 0 && right == 0) return 0;
        if(left == 0) return right + 1;
        if(right == 0) return left + 1; 
        return Math.min(left + 1, right + 1);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


