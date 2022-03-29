class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        int count = 1;
        int temp;
        Queue<TreeNode> queue = new ConcurrentLinkedDeque<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.add(root);
        while (count > 0) {
            LinkedList<Integer> insert = new LinkedList<>();
            temp = 0;
            for (int i = 0; i < count; i++) {
                if (queue.element().left != null) {
                    queue.add(queue.peek().left);
                    temp++;
                }
                if (queue.element().right != null) {
                    queue.add(queue.peek().right);
                    temp++;
                }
                if (queue.peek() != null) {
                    insert.add(queue.poll().val);
                }
            }
            count = temp;
            ans.add(insert);
        }
        return ans;
    }
}

