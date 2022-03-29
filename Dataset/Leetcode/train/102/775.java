 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        List<TreeNode> now = new ArrayList<TreeNode>();
        List<TreeNode> next = new ArrayList<TreeNode>();
        now.add(root);
        TreeNode node = root;
        while(!now.isEmpty()){
            next.clear();
            List<Integer> l = new ArrayList<>();
            for(TreeNode n:now){
                if(n.left!=null) next.add(n.left);
                if(n.right!=null) next.add(n.right);
                l.add(n.val);
            }
            list.add(l);
            now.clear();
            for(TreeNode n:next){
                now.add(n);
            }
        }
        return list;
    }
}

