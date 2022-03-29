class Solution {
    public int XXX(TreeNode root) {
        int count = 0; 
        if(root == null){
            return count;
        }
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int i = queue.size();
            if(flag) return count;
            count++;
            while(i-- > 0){
                TreeNode cur = queue.poll();
                if(cur.left == null && cur.right == null){
                    flag = true;
                    break;
                }
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            } 
        }
        return count;
    }
}

