 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode>st=new Stack<>();
        List<Integer>res=new LinkedList<>();
        while(st.size()!=0||root!=null){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                root=st.pop();
                res.add(root.val);
                root=root.right;
            }
        }
        return res;
    }
}

