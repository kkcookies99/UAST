 class Solution {
    public boolean XXX(TreeNode root) {
        // 递归终止条件 ： root == null 的时候直接返回true
        if(root == null){
            return true;
        }
        // 首先判断 根节点 <= 左节点 或者 根节点 >= 右节点 直接返回false 不符合二叉搜索树
        if((root.left != null && root.val <= root.left.val) || ((root.right != null && root.val >= root.right.val))){
            return false;
        }

        // 即使左节点和右节点都是二叉树并不代表整个根节点就是二叉树，例如：[5,4,6,null,null,3,7]
        // 需要额外的条件，根节点要大于左节点的最大值，根节点要小于右节点的最小值
        return process(root) && XXX(root.left) && XXX(root.right);
    }

    // 根节点要大于左节点的最大值，根节点要小于右节点的最小值
    public boolean process(TreeNode root){
        if(root == null){
            return false;
        }
        // 找左节点的最大值 - 左节点的最大值就是 root.left 的最大右节点
        boolean leftFlag = true;
        if(root.left != null){
            TreeNode leftNode = root.left;
            while(leftNode.right != null){
                leftNode = leftNode.right;
            }
            leftFlag = leftNode.val < root.val;
        }

        // 找右节点的最小值 - 右节点的最小值就是 root.right 的最小左节点
        boolean rightFlag = true;
        if(root.right != null){
            TreeNode rightNode = root.right;
            while(rightNode.left != null){
                rightNode = rightNode.left;
            }
            rightFlag = rightNode.val > root.val;
        }

        return rightFlag && leftFlag;
    }
}

