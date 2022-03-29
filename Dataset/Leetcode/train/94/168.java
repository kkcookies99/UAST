 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root!=null){
            List l1 = XXX(root.left);
            list.addAll(l1);
            list.add(root.val);
            List l2 = XXX(root.right);
            list.addAll(l2);
            return list;
        }else{
            return list;
        }
      
    }
}

