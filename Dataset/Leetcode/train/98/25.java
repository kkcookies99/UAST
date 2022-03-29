 class Solution {

    public int preValue = Integer.MIN_VALUE;
    public int preValue1 = Integer.MIN_VALUE;

    public boolean XXX(TreeNode root) {
        if(root == null){
             return true;
        }
        boolean isLift = XXX(root.left);
        if(!isLift){
            return false;
        } 
        //处理[-2147483648]、[-2147483648,-2147483648]、[-2147483648,null，2147483648，-2147483647]
        if(root.val == preValue && root.val == preValue1){
              preValue += 1;
            preValue1 += 1;
        }
        else if(root.val <= preValue){
            return false;
        }else{
            preValue = root.val;
        }
        return XXX(root.right);
    }
}

