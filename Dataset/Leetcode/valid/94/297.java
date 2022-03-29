 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> st =new Stack<>();
        while(root!=null | !st.isEmpty()) {
            if(root!=null) {
                st.add(root);
                root = root.left;
            }else {
                root = st.pop();
                res.add(root.val);
                root = root.right;
            }
        }return res;
    }
}

