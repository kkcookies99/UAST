class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tree = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            tree = new ArrayList<>();
            int currentLevel = queue.size();
            while(currentLevel != 0){
                TreeNode node = queue.poll();
                if(node != null){
                    tree.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
                currentLevel--;
            }
            if(!tree.isEmpty()){//这里千万不能写成tree != null
                list.add(tree);
            }
            
        }
        return list;
    }
}

