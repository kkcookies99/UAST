class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftMaxDepth=XXX(root.left);
        int rightMaxDepth=XXX(root.right);
        return Math.max(leftMaxDepth,rightMaxDepth)+1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


