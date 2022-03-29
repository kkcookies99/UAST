class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while(list.size() > 0){
            List<Integer> tmp = new ArrayList<>();
            list.forEach(a -> tmp.add(a.val));
            ans.add(new ArrayList<>(tmp));
            List<TreeNode> cur = nextFloor(list);
            list.clear();
            cur.forEach(a -> list.add(a));

        }
        return ans;
    }
    /**
        根据当层节点，返回下一层节点
     */
    public List<TreeNode> nextFloor(List<TreeNode> list){
        List<TreeNode> res = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).left != null) res.add(list.get(i).left);
            if(list.get(i).right != null) res.add(list.get(i).right);
        }
        return res;
    }
}

