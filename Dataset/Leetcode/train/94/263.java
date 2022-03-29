 class Solution {
    public List<Integer> XXX(TreeNode root) {
        BinaryTree binaryTree = new BinaryTree();
        List<Integer> list = new ArrayList<>();
        binaryTree.midOrder(list, root);
        return list;
    }
}

class BinaryTree {
    public void midOrder(List<Integer> list, TreeNode treeNode) {
        if (treeNode == null || treeNode.val == 0) {
            // 二叉树为空
            return;
        }
        if (treeNode.left != null) {
            midOrder(list, treeNode.left);
        }
        list.add(treeNode.val);
        if (treeNode.right != null) {
            midOrder(list, treeNode.right);
        }
    }
}

