public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        int level = 0;
        XXX(root, level, lists);
        return lists;
    }

     private void XXX(TreeNode root, int level, List<List<Integer>> lists) {
        if (root == null) return;
        //获取当前level的节点列表.
        if (lists == null || lists.size() <= level || lists.get(level) == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        } else {
            List<Integer> currentLevelList = lists.get(level);
            currentLevelList.add(root.val);
        }
        XXX(root.left, level + 1, lists);
        XXX(root.right, level + 1, lists);
    }

