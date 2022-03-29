class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offerLast(root);
        while(!list.isEmpty()){
            int len = list.size();
            List<Integer> temp = new ArrayList<>();
            while(len--!=0){
                TreeNode tempNode = list.pollFirst();
                temp.add(tempNode.val);
                if(tempNode.left!=null)
                    list.offerLast(tempNode.left);
                if(tempNode.right!=null)
                    list.offerLast(tempNode.right);
            }
            res.add(temp);
        }
        return res;
    }
}

