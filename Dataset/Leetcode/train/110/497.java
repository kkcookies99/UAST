class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) {
            return true;
        }
        // 当前节点左右子节点都为空时，平衡，记当前节点高度为1
        if(root.left == null && root.right == null) {
            root.val = 1;
            return true;
        }
        // 判断当前节点左子树是否平衡
        if(XXX(root.left)) {
            // 左子树平衡时，且左子节点为空，暂记当前节点高度为1(0+1)
            if(root.left == null) {
                root.val = 1;
            } else {
            // 左子树平衡时，左子节点不为空，暂记当前节点高度为左节点+1
                root.val = root.left.val + 1;
            }
        } else {
            // 左子树不平衡，返回false
            return false;
        }
        // 判断当前节点右子树是否平衡
        if(XXX(root.right)) {
            // 右子树平衡时，且右子节点为空，判断当前子树是否平衡（root.val(左子树高度) - 1 <= 1）,此时root.val >= 1（右子树高度）
            // 故不需刷新节点高度
            if(root.right == null) {
                return root.val - 1 <= 1;
            }
            // 右子树平衡时，且右子树不为空，判断当前子树是否平衡
            boolean result = Math.abs(root.right.val + 1 - root.val) <= 1;
            if(root.val <= root.right.val + 1 && result)  {
                // 当前子树平衡时，刷新当前子树高度
                root.val = root.right.val + 1;
            }
            return result;
        } else {
            // 右子树不平衡时，返回false
            return false;
        }
    }
}

