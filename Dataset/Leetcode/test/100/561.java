 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(p);
        queue2.offer(q);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode temp1 = queue1.poll();
            TreeNode temp2 = queue2.poll();

            if (temp1 == null || temp2 == null) {
                if (temp1 != temp2) {
                    return false;
                } else {
                    continue;
                }
            } else {
                if (temp1.val != temp2.val) {
                    return false;
                } else {
                    queue1.offer(temp1.left);
                    queue1.offer(temp1.right);

                    queue2.offer(temp2.left);
                    queue2.offer(temp2.right);
                }  
            }
        }

        return true;
    }
}

