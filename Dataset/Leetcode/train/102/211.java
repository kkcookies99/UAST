class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        TreeNode[] queue = new TreeNode[1010];
        int head = 0, tail = 0;
        queue[tail++] = root;
        while(head != tail) {
            int size = tail - head;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue[head++];
                list.add(node.val);
                if(node.left != null) queue[tail++] = node.left;
                if(node.right != null) queue[tail++] = node.right;
            }
            res.add(list);
        }
        return res;
    }
}

