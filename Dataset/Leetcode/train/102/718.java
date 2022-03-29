 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list=new<ArrayList<Integer>> ArrayList();
        XXX(root,list,1);
        return list;
    }
    public void XXX(TreeNode root,List<List<Integer>> list,int depth){
        if(root==null) return;
        if(list.size()<depth){
            list.add(new ArrayList<Integer>());
        }
        list.get(depth-1).add(root.val);
        XXX(root.left,list,depth+1);
        XXX(root.right,list,depth+1);
    }
}

