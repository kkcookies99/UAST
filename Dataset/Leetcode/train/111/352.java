class Solution {
    public int XXX(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList();
        list.add(root);
        int rulset = 0;
        while(list.size() > 0){
            rulset++;
            ArrayList<TreeNode> ilist = new ArrayList();
            for(TreeNode t :list){
                if(null==t){
                    continue;
                }else if(null==t.left && null==t.right){
                    return rulset;
                }else{
                    ilist.add(t.left);
                    ilist.add(t.right);
                }
            }
            list = ilist;
        }
        return 0;
    }
}

