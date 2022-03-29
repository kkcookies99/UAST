 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null) return arr;

        TreeNode cur = root;
        TreeNode mostRight = null;

        while(cur != null){
            mostRight = cur.left;
            if(mostRight != null){
                while(mostRight.right != null && mostRight.right != cur){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    mostRight.right = cur;
                    cur = cur.left;
                }else{
                     arr.add(cur.val);
                    cur = cur.right;
                    mostRight.right = null;
                }
            }else{
                arr.add(cur.val);
                cur = cur.right;
            }
        }
        return arr;
    }
}

