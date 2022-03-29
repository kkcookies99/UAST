class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null) return new ArrayList<List<Integer>>();
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode curend=root;
        TreeNode nextend=null;
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            list.add(cur.val);
            if(cur.left!=null){
                nextend=cur.left;
                queue.add(cur.left);
            }
            if(cur.right!=null){
                nextend=cur.right;
                queue.add(cur.right);
            }
            if(cur==curend){
                lists.add(new ArrayList<>(list));
                list.clear();
                curend=nextend;
                nextend=null;
            }
        }
        return lists;
    }
}

