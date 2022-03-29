class Solution {
    public int XXX(TreeNode root) {
       return depthIndex(root);
    }
    private int depthIndex(TreeNode node){
       if (node==null){
           return 0;
       }
       int index1 = depthIndex(node.left)+1;
       int index2 =depthIndex(node.right)+1;
       return Math.max(index1,index2);
    }
}

