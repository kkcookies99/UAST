class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;

        
        queue.offer(root);
        int temp = 1;
        int value = 0;
        List<Integer> list = new LinkedList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            
            list.add(node.val);
            if(node.left != null) {
                queue.offer(node.left);
                value ++;
            }
            if(node.right != null) {
                queue.offer(node.right);
                value ++;
            }
            temp --;
            if(temp == 0) {
                temp = value;
                value = 0;
                res.add(list);
                list = new LinkedList<>();
            }
        }

        return res;
    }
}

