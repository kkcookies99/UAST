 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        while(root != null){
            if(root.left == null){
                res.add(root.val);
                root = root.right;
            } else{
                TreeNode node = getPre(root);
                if(node.right == root){
                    node.right = null;
                    res.add(root.val);
                    root = root.right;
                } else{
                    node.right = root;
                    root = root.left;
                }
            }
        }
        return res;
    }
    public TreeNode getPre(TreeNode root){
        TreeNode node = root.left;
        while(node.right != null && node.right != root){
            node = node.right;
        }
        return node;
    }
}

