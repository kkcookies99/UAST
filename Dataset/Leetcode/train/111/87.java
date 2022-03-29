class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        int deep=1;
        while(deque.size()>0){
            int num = deque.size();
            for(int i=0;i<num;i++){
                TreeNode cur = deque.poll();
                if(cur.left==null&&cur.right==null){
                    return deep;
                }
                if(cur.left!=null){
                    deque.add(cur.left);
                }
                if(cur.right!=null){
                    deque.add(cur.right);
                }
            }
            deep++;
        }
        return deep;
    }
}

