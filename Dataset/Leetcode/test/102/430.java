class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        List<List<TreeNode>> tres = new ArrayList<List<TreeNode>>();            
        List<TreeNode> first = new ArrayList();
        first.add(root);
        tres.add(first);
        for(int i =0; i < tres.size(); i++){
            addT(tres.get(i), tres);
        }
        for(List<TreeNode> l : tres){
            List<Integer> rt = new ArrayList<>();
            for(TreeNode t : l){
                rt.add(t.val);
            }
            res.add(rt);
        }
        return res;
    }
    void addT(List<TreeNode> list, List<List<TreeNode>> tres){
        List<TreeNode> tmp = new ArrayList<>();
        for(TreeNode t: list){
            if(t.left != null){
                tmp.add(t.left);
            }
            if(t.right != null){
                tmp.add(t.right);
            }
        }
        if(tmp.size() > 0){
            tres.add(tmp);
        }
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


