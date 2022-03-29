class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=1;
        if(root.left!=null&&root.right!=null){
            ans=Math.min(ans+XXX(root.left),ans+XXX(root.right));
        }
        else if(root.right==null){
            ans+=XXX(root.left);
        }
        else if(root.left==null){
            ans+=XXX(root.right);
        }
        return ans;
    }
}

