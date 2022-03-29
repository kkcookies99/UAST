 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        List<Integer> list=new ArrayList();
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            TreeNode node=stack.pop();
            list.add(node.val);
            root=node.right;
        }
        return list;
    }
}

