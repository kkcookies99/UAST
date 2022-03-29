class Solution {
    public int XXX(TreeNode root) {
        if (root==null) return 0;
        Deque<TreeNode> level=new ArrayDeque();
        int c=0;
        level.offer(root);
        boolean flag=true;
        while (level.size()!=0&&flag){
            c++;
            int len=level.size();
            for (int i = 0; i < len; i++) {
                TreeNode node=level.poll();
                if (node.left!=null) level.offer(node.left);
                if (node.right!=null) level.offer(node.right);
                if (node.right==null&&node.left==null) {
                    flag=false;
                    break;
                }
            }
        }
        return c;
    }
}

