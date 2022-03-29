 class Solution {
    ArrayList<Integer> nums = new ArrayList<>();

    public boolean XXX(TreeNode root) {
        LNR(root);
        long temp = (long)Integer.MIN_VALUE-1;
        for(int num:nums){
            if(num<=temp) return false;
            temp = num;
        }
        return true;
    }
    public void LNR(TreeNode root){
        if(root == null) return;
        LNR(root.left);
        nums.add(root.val);
        LNR(root.right);
    }

}

