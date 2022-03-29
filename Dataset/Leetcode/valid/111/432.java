class Solution {
    public int XXX(TreeNode root) {

        if(root == null) return 0;
        int Left = XXX(root.left) + 1;
        int Right = XXX(root.right) + 1;
        if(Left == 1 && Right != 1) return Right;
        else if(Left != 1 && Right == 1) return Left;
        else return Math.min(Left, Right);
    }
}

