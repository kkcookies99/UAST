 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        List<TreeNode> list = new ArrayList<TreeNode>();
        //root不是null或者栈没空都说明没遍历完
        while(root!=null || list.size()!=0){
           if(root!=null){
               list.add(root);
               root = root.left;
           }else{
               root = list.get(list.size()-1);
               list.remove(list.size()-1);
               res.add(root.val);
               root = root.right;
           }
        }
        return res;
    }
}

