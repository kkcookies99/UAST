class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Deque deque = new ArrayDeque();
        if (root!=null){
            deque.addFirst(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> temp = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = (TreeNode) deque.getFirst();
                deque.removeFirst();
                temp.add(node.val);

                if (node.left!=null) deque.addLast(node.left);
                if (node.right!=null) deque.addLast(node.right);

            }
            res.add(temp);
        }
        return res;
    }
}

