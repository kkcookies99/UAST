 class Solution {

    public class Info {
        public int max;
        public int min;
        public boolean isBST;
        public Info(int max, int min, boolean isBST){
            this.max = max;
            this.min = min;
            this.isBST = isBST;
        }
    }
    public boolean XXX(TreeNode root) {
        return process(root).isBST;
    }

    public Info process(TreeNode root){
        if (root == null){
            return null;
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);
        int min = root.val;
        int max = root.val;
        boolean isBST = true;
        if (leftInfo != null){
            min = leftInfo.min < min ? leftInfo.min : min;
            max = leftInfo.max > max ? leftInfo.max : max;
        }
        if (rightInfo != null){
            max = rightInfo.max > max ? rightInfo.max : max;
            min = rightInfo.min < min ? rightInfo.min : min;
        }
        if ((leftInfo != null && root.val <= leftInfo.max)
          || (rightInfo != null && root.val >= rightInfo.min)
          || (leftInfo != null && !leftInfo.isBST) 
          || (rightInfo != null && !rightInfo.isBST)){
             isBST = false;
         }
        return new Info(max, min, isBST);
    }
}

