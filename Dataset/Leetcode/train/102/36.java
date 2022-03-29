class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();    // LinkedList优化每次从头进行添加
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){queue.add(root);}
        while (!queue.isEmpty())
        {
            List<Integer> list2 = new ArrayList<>();
            int i = 0;
            for (TreeNode c:queue)
            {
                list2.add(c.val);
                i++;
            }
            while (i != 0)
            {
                TreeNode temp_treeNode;
                temp_treeNode = queue.poll();
                if (temp_treeNode.left != null) {queue.add(temp_treeNode.left);}
                if (temp_treeNode.right != null) {queue.add(temp_treeNode.right);}
                i--;
            }
            list.add(list2);
        }
        return list;
    }
}

