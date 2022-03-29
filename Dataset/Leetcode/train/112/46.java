class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null) return false;
        return x(root,targetSum,0);
    }

    public static boolean x(TreeNode root, int target,int count ){
          boolean flag = false;
          
          count+=root.val;
          
          if(count != target && root.left == null && root.right == null) return false;
          else if(count == target && root.left == null && root.right == null) return true;
          
          if(root.left != null) flag = x(root.left,target,count);
          
          if(flag) return flag;
          
          if(root.right != null) flag = x(root.right,target,count);
          
          return flag;
    }
}