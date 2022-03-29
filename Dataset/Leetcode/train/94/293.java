 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Stack<TreeNode> stack =  new Stack();
        while(root!=null || (!stack.isEmpty())){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }
            else{
                TreeNode temp = stack.pop();
                ans.add(temp.val);
                root = temp.right;
            }
        }
        return ans;
    }
}

