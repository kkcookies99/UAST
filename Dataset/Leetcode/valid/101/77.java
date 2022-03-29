 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            if (len % 2 != 0 && queue.peek() != root){
                return false;
            }
            int limit = len / 2;
            Deque<TreeNode> stack = new ArrayDeque<>();//存储每一层前一半的值
            while(len != 0){
                TreeNode node = queue.poll();
                if (node != null){
                    if (len > limit){
                        stack.push(node);
                    }else {
                        if (node.val != stack.pop().val)
                            return false;
                    }
                    queue.offer(node.left);
                    queue.offer(node.right);
                }else {
                    if (len > limit){
                        stack.push(new TreeNode(Integer.MAX_VALUE));
                    }else {
                        if (stack.pop().val != Integer.MAX_VALUE)
                            return false;
                    }
                }
                len--;
            }
        }
        return true;

    }
}

