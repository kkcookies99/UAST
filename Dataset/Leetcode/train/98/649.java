 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }

        if(root.left!=null){
            if(root.left.val>=root.val){
                return false;
            }

            if(root.val<=getMax(root.left)){
                return false;
            }
        }

        if(root.right!=null){
            if(root.right.val<=root.val){
                return false;
            }
            if(root.val>=getMin(root.right)){
                return false;
            }
        }
        return true&&XXX(root.left)&&XXX(root.right);
    }

    private int getMin(TreeNode node){
        int min = node.val;
        if(node.left!=null){
            min = Math.min(getMin(node.left),min);
        }
        return min;
    }

    private int getMax(TreeNode node){
        int max = node.val;
        if(node.right!=null){
            max = Math.max(getMax(node.right),max);
        }
        return max;
    }
}

