class Solution {
    public int XXX(TreeNode root) {
if (root==null)return 0;
        else return getMinDep(root);
    }
    private static boolean isLeaf(TreeNode root){
        return (root!=null&&root.left==null&&root.right==null)?true:false;
    }
    private static int getMinDep(TreeNode root){
        if(isLeaf(root))return 1;
        else if (root.right==null)return 1+getMinDep(root.left);
        else if (root.left==null)return 1+getMinDep(root.right);
        else if (isLeaf(root.right)||isLeaf(root.left)){return 2;}
        else return 1+Math.min(getMinDep(root.left),getMinDep(root.right));
    }
}

