class Solution {
    public int XXX(TreeNode root) {
        return deep(root,0);
    }

    int deep(TreeNode node, int deepth){
        if (node!=null){
            int leftDeep=deep(node.left,deepth+1);
            int rightDeep=deep(node.right,deepth+1);
            return leftDeep>rightDeep?leftDeep:rightDeep;
        }else {
            return deepth;
        }
    }
}

