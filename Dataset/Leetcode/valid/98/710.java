 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        Integer record = null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr = root;
        while (!stack.isEmpty() || ptr!=null){
            while(ptr!=null) {
                stack.push(ptr);
                ptr = ptr.left;
            }
            ptr = stack.pop();
            // System.out.println(ptr.val);
            if(record!=null && ptr.val<=record) return false;
            record = ptr.val;
            if (ptr.right!=null) {
                ptr = ptr.right;
            } else ptr=null;
        }
        return true;
    }
}

