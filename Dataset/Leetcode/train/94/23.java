 class Solution {
    //中序遍历，左 -> 根 -> 右
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //根结点为空，则输出空list
        if (root == null ) return list;
        //左右子树为空，根不为空，则输出根节点
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }
        //左子树不为空，则递归搜索左子树
        if (root.left != null) {
            list.addAll(XXX(root.left));
        }
        //左子树结束，加根节点
        list.add(root.val);
        ////右子树不为空，则递归搜索右子树
        if (root.right != null) {
            list.addAll(XXX(root.right));
        }
        return list;
    
    }
}

