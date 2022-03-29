class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(depth(root.left,0)-depth(root.right,0))>1){
            return false;
        }
        return XXX(root.left) && XXX(root.right);
    }

    public int depth(TreeNode node,int num){
        if(node==null){
            return num;
        }
        return Math.max(depth(node.left,num++),depth(node.right,num++));//错误
        //return Math.max(depth(node.left,num),depth(node.right,num))+1;//正确
    }
}

