class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        int left = getHeight(root.left,0);
        int right = getHeight(root.right,0);
        boolean flag = false;
        if(Math.abs(left-right)<=1){
            flag = true;
        }
        return flag&&XXX(root.left)&&XXX(root.right);
    }

    private int getHeight(TreeNode node,int parentHeight){
        if(node==null){
            return parentHeight;
        }
        if(node.left==null&&node.right==null){
            return parentHeight+1;
        }
        return Math.max(getHeight(node.left,parentHeight+1),getHeight(node.right,parentHeight+1));

    }
}

