 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return(process(root).isBST);
    }

    public class ReturnType{
        public boolean isBST;
        public int min;
        public int max;
        public ReturnType(boolean isB, int min, int max){
            this.isBST = isB;
            this.min = min;
            this.max = max;
        }
    }

    public ReturnType process(TreeNode root){
        if(root == null){
            return null;
        }
        ReturnType left = process(root.left);
        ReturnType right = process(root.right);
        int min = root.val;
        int max = root.val;
        if(left != null){
            min = Math.min(min, left.min);
            max = Math.max(max, left.max);
        }
        if(right != null){
            min = Math.min(min, right.min);
            max = Math.max(max, right.max);
        } 
        boolean isBST = true;
        if(left != null && (!left.isBST || left.max >= root.val)){
            isBST = false;
        }
        if(right != null && (!right.isBST || right.min <= root.val)){
            isBST = false;
        }
        return new ReturnType(isBST, min, max);
    }
}

