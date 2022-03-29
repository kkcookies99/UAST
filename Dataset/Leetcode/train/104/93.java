class Solution {
    public int XXX(TreeNode root) {
        int res = 0;
        if (root==null){
            return res;
        }

        Deque deque = new ArrayDeque();
        deque.addFirst(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            for (int i=0;i<size;i++){
                TreeNode node = (TreeNode) deque.getFirst();
                deque.removeFirst();

                if (node.left!=null) deque.addLast(node.left);
                if (node.right!=null) deque.addLast(node.right);
            }
            res =res+1;

        }

        return res;
    }
}

