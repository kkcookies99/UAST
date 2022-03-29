 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        TreeNode cur = root;
        TreeNode mostRight = null;
        while(cur != null){
            mostRight = cur.left;
            if(mostRight != null){//有左树
                //找到左树的真实的最右节点
                while(mostRight.right != null && mostRight.right != cur)
                    mostRight = mostRight.right;
                if(mostRight.right == null){
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }else{
                    mostRight.right = null;
                }
            }
            list.add(cur.val);
            //如果没有左树，cur来到右树
            cur = cur.right;
        }
        return list;
    }
}

