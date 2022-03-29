 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        //Morris算法
        TreeNode node=root;
        TreeNode backTrace=null;
        while(node!=null){
            if(node.left!=null){
                backTrace=node.left;
                while(backTrace.right!=null&&backTrace.right!=node)
                    backTrace=backTrace.right;
                if(backTrace.right==null){
                    backTrace.right=node;
                    node=node.left;
                }
                else{
                    backTrace.right=null;
                    res.add(node.val);
                    node=node.right;
                }
            }
            else{
                res.add(node.val);
                node=node.right;
            }
        }
        return res;
    }
}

