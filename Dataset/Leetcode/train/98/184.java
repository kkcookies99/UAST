 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        TreeNode left = root.left;
        if(left != null){
            while(left.right != null){
                left = left.right;
            }
            if(root.val <= left.val){
                return false;
            }
        }
        TreeNode right = root.right;
        if(right != null){
            while(right.left != null){
                right = right.left;
            }
            if(root.val >= right.val){
                return false;
            }
        }
        return XXX(root.left) && XXX(root.right);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


