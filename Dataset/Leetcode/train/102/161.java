class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> zong= new LinkedList<>();
        zong.add(root);
        while(!zong.isEmpty()){
            int len = zong.size();
            List<Integer> ceng =  new LinkedList<>();
            while(len>0){
                TreeNode node = zong.poll();
                ceng.add(node.val);
                if(node.left != null) zong.add(node.left);
                if(node.right != null) zong.add(node.right);
                len--;
            }
            res.add(ceng);
        }
        return res;
    }
}

