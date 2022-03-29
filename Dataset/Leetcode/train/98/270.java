 class Solution {
    public boolean XXX(TreeNode root) {

        if (root == null)
        {
            return true;
        }

        Deque<TreeNode> aDeque = new LinkedList<TreeNode> ();

        DFS(root, aDeque);

        TreeNode node = aDeque.poll();

        int num = node.val;

        while (!aDeque.isEmpty())
        {
            TreeNode aNode = aDeque.poll();

            if (aNode.val > num)
            {
                num = aNode.val;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    public void DFS(TreeNode root, Deque<TreeNode> deque)
    {
        if (root != null)
        {
            DFS(root.left, deque);
            deque.offer(root);
            DFS(root.right, deque);
        }
    }
}

