 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root,null,null);
    }

    private boolean XXX(TreeNode node,Integer low,Integer high){
        if(node == null)
            return true;
        
        if(low != null && node.val <= low) 
            return false;
        if(high != null && node.val >= high)
            return false;

        return XXX(node.left,low,node.val) 
            && XXX(node.right,node.val,high);
    }
}

