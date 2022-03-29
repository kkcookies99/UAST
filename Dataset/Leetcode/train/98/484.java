 class Solution {
    public boolean XXX(TreeNode root) {
        TreeNode current = root;
        TreeNode mostRight;
        long lastVal = Long.MIN_VALUE; // 该变量用以判断中序遍历节点的val是否递增，初始为Long.MIN_VALUE，以应对测试用例中出现节点val等于-2147483648的情况
        while (current != null) {
            mostRight = current.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != current)
                    mostRight = mostRight.right;
                if (mostRight.right == null) { // 第一次来到current节点，让current节点左子树最右节点的右指针指向current
                    mostRight.right = current;
                    current = current.left; // 继续循环扫描current的左子树
                    continue;
                } else { // 第二次来到current节点，重新将current节点左子树最右节点的右指针指向null
                    mostRight.right = null;
                }
            }
            // 判断当前current节点的val是否大于lastVal
            if (current.val <= lastVal)
                return false;
            lastVal = current.val;
            current = current.right;
        }
        return true;
    }
}

