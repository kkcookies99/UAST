 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 中序遍历二叉搜索树，结果一定是一个递增序列

        Stack<TreeNode> stack = new Stack<>();
        TreeNode index = root;
        Integer temp = null;
        while (index != null || !stack.isEmpty()) {
            while (index != null) {
                stack.push(index);
                index = index.left;
            }
            index = stack.pop();
            if (temp == null || temp < index.val) {
                temp = index.val;
            } else {
                // 当前不大于上一个节点，说明不是BST
                return false;
            }
            index = index.right;
        }
        return true;
    }
}

