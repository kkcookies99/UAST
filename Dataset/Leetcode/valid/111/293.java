class Solution {
    public int XXX(TreeNode root) {
        return root==null?0:getLeafNode(root,1);
    }
    public static int getLeafNode(TreeNode node,int l){
        if(node.left==null&&node.right==null){
            return l;
        }else{
            int left=0,right=0;
            if(node.left!=null){

               left= getLeafNode(node.left,l+1);
            }
            if(node.right!=null){
                right= getLeafNode(node.right,l+1);
            }
            if(node.left!=null&&node.right!=null) {
                return Math.min(left, right);
            }else{
                if(node.left==null){
                    return right;
                }else{
                    return left;
                }
            }

        }
    
    }
}

