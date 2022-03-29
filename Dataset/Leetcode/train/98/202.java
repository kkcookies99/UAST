 class Solution {
    public boolean XXX(TreeNode root) {
        TreeNode cur = root;
        TreeNode temp = null;
        long min = Long.MIN_VALUE;
        while (cur != null) {
            temp = cur.left;
            if (temp != null) {
                while (temp.right != null && temp.right != cur) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = cur;
                    cur = cur.left;
                    continue;
                }else if (temp.right == cur) {
                    temp.right = null;
                }
            }
            //中序遍历的添加方法
            if (min >= cur.val) {
                return false;
            }else {
                min = cur.val;
            }
            cur = cur.right;
        }
        return true;
    }
}

