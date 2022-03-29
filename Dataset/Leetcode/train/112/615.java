 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return dfs(root,sum,0);

    }

    private boolean dfs(TreeNode root, int target, int sum) {
        if(root == null) return false;
        sum += root.val;
        boolean left = false;
        boolean right = false;
        if(root.left==null && root.right==null && sum == target){
            return true;
        }
        if(root.left!=null){
             left = dfs(root.left,target,sum);
        }
        if(root.right!=null){
             right = dfs(root.right,target,sum);
        }
        return left||right;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


