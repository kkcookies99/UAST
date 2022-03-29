class Solution {
    public List<List<Integer>> XXX(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode curEnd = root;
        TreeNode nexEnd = null;
        List<Integer> curList = new ArrayList();
        while(!queue.isEmpty())
        {
            TreeNode curNode = queue.poll();
            if(curNode.left!=null)
            {
                queue.add(curNode.left);
                nexEnd = curNode.left;
            }
            if(curNode.right != null)
            {
                queue.add(curNode.right);
                nexEnd = curNode.right;
            }
            curList.add(curNode.val);
            if(curEnd == curNode)
            {
                res.add(curList);
                curList = new ArrayList<>();
                curEnd = nexEnd;
            }
        }

        return res;
    }
}

