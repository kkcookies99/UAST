 class Solution {
    public boolean XXX(TreeNode root) {
        boolean[] isBalance = new boolean[]{true};
        if(root == null){return true;}
        testDeep(root,isBalance);
        return isBalance[0];
    }
    public int testDeep(TreeNode node,boolean[] isBalance){
        if(isBalance[0] == false || node == null){return 0;} 
        int left = testDeep(node.left,isBalance);
        int right = testDeep(node.right,isBalance);
        if(Math.abs(left-right)>1){
            isBalance[0] =false;
            return 0;
        }else{
            return Math.max(left,right)+1;
        }
    }
}

