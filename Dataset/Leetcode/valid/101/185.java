 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSym(root.left,root.right);
    }

    public boolean isSym(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root1);
        queue2.offer(root2);
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            int i  = queue1.size();
            int j  = queue2.size();
            if(i != j){
                return false;
            }
            while(i-- >0 && j-- >0){
                TreeNode node1 = queue1.poll();
                TreeNode node2 = queue2.poll();
                if(node1 == null && node2 == null) continue;
                if((node1 == null || node2 == null) || (node1.val != node2.val)){
                    return false;
                }
                queue1.offer(node1.left);
                queue1.offer(node1.right);
                queue2.offer(node2.right);            
                queue2.offer(node2.left);
            }
        }
        return true;
    }
}

