 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        List<Integer> list1=XXX(root.left);
        list.addAll(list1);
        list.add(root.val);
        List<Integer> list2=XXX(root.right);
        list.addAll(list2);
        return list;
    }
}

