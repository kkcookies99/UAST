 class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        int dl = XXX(root.left) + 1;
        int dr = XXX(root.right) + 1;
        return dl>dr? dl:dr;
    }
}

