 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> vals = new ArrayList<>();
            //TreeNode node = queue.removeFirst();  不能放到这里
            while(count > 0){
                TreeNode node = queue.removeFirst();
                vals.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                count --;//count大于0说明当前遍历的所有节点都在同一层
            }
            list.add(vals);

        }

        return list;
    }
}

