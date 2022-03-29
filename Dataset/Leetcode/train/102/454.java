class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list2=new ArrayList<>();
            int size=queue.size();
            while(size>0){
                TreeNode cur=queue.poll();
                list2.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
                size--;
            }
            list.add(list2);
        }
        return list;
    }
}

