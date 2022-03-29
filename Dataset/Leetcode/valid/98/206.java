 class Solution {
    public boolean XXX(TreeNode root) {
        return valid(root, null, null);
    }
    
    private boolean valid(TreeNode root, Integer leftBound, Integer rigthBound){
        if(root==null){
            return true;
        }
        boolean leftStatus = false;
        boolean rightStatus = false;
        
        if(leftBound==null || root.val>leftBound){
            leftStatus = true;
        }
        if(rigthBound==null || root.val<rigthBound){
            rightStatus = true;
        }
        
        if(leftStatus==false || rightStatus==false){
            return false;
        }
        return valid(root.left, leftBound, root.val) && valid(root.right, root.val, rigthBound);
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


