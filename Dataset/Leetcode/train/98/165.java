 class Solution {
    boolean flag=true;
    public boolean XXX(TreeNode root) {
        dfs(root);
        return flag;
    }
    public int[] dfs(TreeNode root){
        if(root.left==null && root.right==null) return new int[]{root.val,root.val};
        int[] left=null;
        int[] right=null;
        if(root.left!=null) left=dfs(root.left);
        if(root.right!=null) right=dfs(root.right);
        if(left!=null && root.val<=left[1]) flag=false;
        if(right!=null && root.val>=right[0]) flag=false;
        int[] res=new int[2];
        if(left!=null && right!=null){
            res[0]=Math.min(left[0]<=right[0] ? left[0]:right[0],root.val);
            res[1]=Math.max(right[1]>=left[1] ? right[1]:left[1],root.val);
        }else if(left!=null){
            res[0]=Math.min(left[0],root.val);
            res[1]=Math.max(left[1],root.val);
        }else{
            res[0]=Math.min(right[0],root.val);
            res[1]=Math.max(right[1],root.val);
        }
        return res;
    }
}

补一个中序遍历版本的
class Solution {
    Integer pre=null;
    public boolean XXX(TreeNode root) {
        return preorder(root);
    }
    public boolean preorder(TreeNode root){
        if(root==null) return true;        
        if(!preorder(root.left)) return false;
        if(pre!=null && pre>=root.val) return false;
        pre=root.val;
        if(!preorder(root.right)) return false;
        return true;
    }
}

