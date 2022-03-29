class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode last = root;                       //用last记录每行的最后一个元素
        List<Integer> mylist = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode t = queue.pollFirst(); 
            mylist.add(t.val);
            if(t.left != null){
                queue.add(t.left);
            }
            if(t.right != null){
                queue.add(t.right);
            }
            if(t == last){                          //说明已经遍历到了上一行的最后一个元素 此时队列的最后一个 是当前行的最后一个元素
                list.add(mylist);
                mylist = new ArrayList();
                last = queue.peekLast();
            }
        }
        return list;
    }
}

