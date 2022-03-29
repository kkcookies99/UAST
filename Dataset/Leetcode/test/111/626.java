 class Solution {
    public int XXX(TreeNode root) {
        /*
        if(root==null){
            return 0 ;
        }
        if(root!=null&&root.right==null&&root.left==null){
            return 1 ;
        }
        int left = XXX(root.left) ;
        int right = XXX(root.right) ;

        return left+1>right+1 ? left+1 : right+1 ;
        */
        if(root==null){
            return 0 ;
        }
        int left = XXX(root.left) ;
        int right = XXX(root.right) ;
//增加判断左右子树的情况
        if(left==0){
            return right+1 ;
        }
        if(right == 0){
            return left+1 ;
        }
        return left<right ? left+1 : right+1 ;
    }
}

