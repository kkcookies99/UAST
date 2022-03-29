 class Solution {
    public boolean XXX(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root.left);
        deque.push(root.right);
        while(!deque.isEmpty()){

            TreeNode node1 = deque.pop();
            TreeNode node2 = deque.pop();
        
            if(node1 == null && node2 == null){
                continue;
            }

            if(node1 == null || node2 == null || node1.val != node2.val){
                return false;
            }
            deque.push(node1.left);
            deque.push(node2.right);
            deque.push(node1.right);
            deque.push(node2.left);
        }
        return true;
    }
}

