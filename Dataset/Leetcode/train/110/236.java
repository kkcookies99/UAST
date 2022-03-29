class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        else{
            return (getHeight(root) == -2)?false:true;
        }
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return -1;
        }
        else{
            int lh = getHeight(root.left) + 1;
            int rh = getHeight(root.right) + 1;
            if(lh == -1 || rh == -1){               // 出现不平衡，传递
                return -2;
            }
            else if(Math.abs(lh - rh) > 1){
                return -2;
            }
            else{
                return Math.max(lh, rh);
            }
        }
    }
}

