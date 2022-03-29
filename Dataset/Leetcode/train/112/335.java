 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        //叶子节点递归到这，都没找到路径返回
        if(root == null){
            return false;
        }
        //找到叶子节点，并且节点值等于目标，返回true
        if(root.left == null && root.right == null && root.val == targetSum) return true;
        //在非叶子节点处向叶子节点递归，只要找到一条路就行了，所以用 ||
        return XXX(root.left,targetSum - root.val) || XXX(root.right,targetSum - root.val);
    }
}

