class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){return true;}
        else{
            return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && XXX(root.left) && XXX(root.right);
        }
    }

    public int getHeight(TreeNode curNode){
        if(curNode == null){
            return 0;
        }
        else{
            return Math.max(getHeight(curNode.left), getHeight(curNode.right)) + 1;
        }
    }
}

