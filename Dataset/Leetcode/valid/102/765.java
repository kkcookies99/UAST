 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> AL = new ArrayList();
        if(root == null)
            return AL;
        LinkedList<TreeNode> ls = new LinkedList();
        List<Integer> list = new ArrayList();
        ls.addFirst(root);
        while(!ls.isEmpty()){
            int len = ls.size();
            while(len > 0){
                TreeNode temp = ls.pollLast();
                list.add(temp.val);
                if(temp.left != null){
                    ls.addFirst(temp.left);
                }
                if(temp.right != null){
                    ls.addFirst(temp.right);
                }
                len--;
            }
            AL.add(new ArrayList(list));
            list.clear();
        }
        return AL;
    }
}

