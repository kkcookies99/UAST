class Solution {
    public boolean XXX(TreeNode root) {
        try{
            getDepth(root);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public int getDepth(TreeNode root) throws Exception{
        if(root == null){
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (Math.abs(leftDepth-rightDepth)>1){
            throw new Exception();
        }
        return Math.max(leftDepth,rightDepth)+1;
    }

}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


