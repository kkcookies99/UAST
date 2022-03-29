 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return help(root,0,sum);
    }
    private boolean help(TreeNode root,int total,int target){
        if(root==null){
            return false;
        }
        total += root.val; 
        if(root.left!=null||root.right!=null){
            return help(root.left,total,target)||help(root.right,total,target);
        }
        return total==target;
    }

}

