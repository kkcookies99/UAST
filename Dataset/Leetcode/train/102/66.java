class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        int level = 0;
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        getLevel(root, level, map);
        Set<Integer> set = map.keySet();
        for(Integer i : set){
            res.add(map.get(i));
        }
       return res;
    }

    public void getLevel(TreeNode root, int level, Map<Integer, List<Integer>> map){
        if(root == null){
            return;
        }
        List<Integer> list = map.get(level);
        if(list == null){
            list = new ArrayList<>();
            map.put(level, list);
        }
        list.add(root.val);
        getLevel(root.left, level + 1, map);
        getLevel(root.right, level + 1, map);
    }
}

