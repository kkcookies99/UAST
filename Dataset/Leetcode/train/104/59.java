class Solution {
    public int XXX(TreeNode root) {
        int[] max = new int[]{0};
        depth(root,0,max);
        return max[0];
    }

    public static void depth(TreeNode root,int dept,int[] max){
        if (root == null){
            max[0] = Math.max(dept,max[0]);
        }else{
            depth(root.left,dept + 1,max);
            depth(root.right,dept + 1,max);

        }
    }
}

