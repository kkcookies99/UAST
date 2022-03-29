 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(!stack.isEmpty() || curr!=null){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            TreeNode node=stack.pop();
            res.add(node.val);
            if(node.right!=null){
                curr=node.right;
            }
        }
        return res;
    }
}

