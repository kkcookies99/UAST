class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverseTree(root,result,0);
        return result;
    }

    private static void traverseTree(TreeNode root,List<List<Integer>> list,Integer index){
        if(root == null)
            return;
        int size = list.size();
        List<Integer> offList = size == 0 || index > size - 1 ? null : list.get(index);
        if(offList == null) {
            offList = new ArrayList<>();
            offList.add(root.val);
            list.add(index,offList);
        }
        else{
            offList.add(root.val);
        }
        traverseTree(root.left,list,index + 1);
        traverseTree(root.right,list,index + 1);
    }
}

