class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;   
        }
        List<TreeNode> queue = new ArrayList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> li = new ArrayList<>();
            List<TreeNode> next = new ArrayList<>();
            for(TreeNode p : queue){
                li.add(p.val);
                if(p.left != null){
                    next.add(p.left);
                }
                if(p.right != null){
                    next.add(p.right);
                }
            }
            res.add(li);
            queue = next;
        }
        return res;
    }
}

