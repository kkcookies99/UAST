class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        
        List<List<Integer>> outlist=new ArrayList<>();
        if(root==null)return outlist;
        List<TreeNode> nodelist=new ArrayList<>();
        nodelist.add(root);
        while(!nodelist.isEmpty()){
            int len=nodelist.size();
            List<Integer> inlist=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node=nodelist.get(0);
                
                    inlist.add(node.val);
                    if(node.left!=null) nodelist.add(node.left);
                    if(node.right!=null) nodelist.add(node.right);
                
                
                nodelist.remove(0);
            }
            outlist.add(inlist);
        }
        return outlist;
    }
}

