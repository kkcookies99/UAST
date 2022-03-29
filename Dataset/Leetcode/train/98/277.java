 class Solution {
    List<Integer> order = new LinkedList<>();
    public boolean XXX(TreeNode root) {
        validate(root);
        int size = order.size();
        Object[] a = order.toArray();
        for(int i = 1; i < size; i++) {
            if((int)a[i] <= (int)a[i - 1]) return false;
        }
        return true;
    }
    public void validate(TreeNode root) {
        if(root != null) {
            validate(root.left);
            order.add(root.val);
            validate(root.right);
        }
        
    }
}

