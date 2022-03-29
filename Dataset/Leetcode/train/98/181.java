 class Solution {
    public boolean XXX(TreeNode root) {
   
        return judge(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    public boolean judge(TreeNode root,long min, long max){
        if(root==null){
            return true;
        }
        if(root.val <=min || root.val >= max){
            return false;
        }


        return judge(root.left,min,root.val) &&
        judge(root.right,root.val,max);

    }
}

