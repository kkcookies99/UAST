 class Solution {
    public List<Integer> XXX(TreeNode root) {
    LinkedList<TreeNode> list = new LinkedList<>();
    List<Integer> intList = new ArrayList<>();
    TreeNode cur = root;
    while(cur!=null || !list.isEmpty()){
        if(cur!=null){
            list.offer(cur);
            cur = cur.left;
        }else{
            cur = list.pollLast();
            intList.add(cur.val);
            cur = cur.right;
        }
    }
    return intList;
    }
}

