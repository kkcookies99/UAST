 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        LinkedList<TreeNode> stack=new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.add(root);
                root=root.left;
            }
            root=stack.removeLast();
            ans.add(root.val);
            root=root.right;
        }
        return ans;
    }
}

