 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode p = root;
        while(p != null){
            if(p.left == null){
                result.add(p.val);
                p = p.right;
            }else{
                TreeNode preMarker = p.left;
                while(preMarker.right != null && preMarker.right != p){
                    preMarker = preMarker.right;
                }
                if(preMarker.right == null){
                    preMarker.right = p;
                    p = p.left;
                }
                if(preMarker.right == p){
                    preMarker.right = null;
                    result.add(p.val);
                    p = p.right;
                }
            }
        }
        return result;
    }
}

