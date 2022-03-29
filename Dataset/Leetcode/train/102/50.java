class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root == null){
            return  res;
        }
        queue.add(root);


        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list  = new ArrayList<>();
            while (count > 0){
                TreeNode tempNode = queue.poll();
                list.add(tempNode.val);

                if(tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if(tempNode.right != null){
                    queue.add(tempNode.right);
                }
                count--;
            }
            res.add(list);
        }

        return  res;

    }
}

