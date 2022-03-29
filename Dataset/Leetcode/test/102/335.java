class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new LinkedList();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int wid = q.size();
            List<Integer> curLay = new LinkedList();
            for(int i = 0; i < wid; i++) {
                TreeNode node = q.poll();
                curLay.add(node.val);
                if(node.left != null) {q.add(node.left);}
                if(node.right != null) {q.add(node.right);}
            }
            res.add(curLay);
        }
        return res;
    }
}

