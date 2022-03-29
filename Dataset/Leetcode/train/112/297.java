 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            if(root.val==targetSum) return true;
            return false;
        }
        return XXX(root.left,targetSum-root.val)||XXX(root.right,targetSum-root.val);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


