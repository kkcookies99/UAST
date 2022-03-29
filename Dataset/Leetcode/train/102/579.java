class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;
        queue.add(root);
        while(queue.size()!=0){
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> temp1 = new ArrayList<>();
            while(queue.size()!=0){
                TreeNode t = queue.poll();
                temp1.add(t.val);
                if(t.left!=null) temp.add(t.left);
                if(t.right!=null) temp.add(t.right);

            }
            res.add(temp1);
            queue = temp;
            
        }
        return res;
    }
}

