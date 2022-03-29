class Solution {
    public int XXX(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int level = 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while(!q.isEmpty()) {
            int size = q.size();
            int count = 0;
            boolean flag = true;
            while(count < size) {
                if(flag) {
                    level++;
                    flag = false;
                }
                TreeNode tNode = q.removeFirst();
                if(tNode.left == null && tNode.right == null) {
                    return level;
                }
                if(tNode.left != null) {
                    q.addLast(tNode.left);
                }
                if(tNode.right != null) {
                    q.addLast(tNode.right);
                }
                count++;
            }
        }
        return level;
    }
}

