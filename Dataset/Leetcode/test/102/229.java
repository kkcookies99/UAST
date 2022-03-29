public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) {
            return new ArrayList();
        }
        Map<TreeNode, Integer> levelMap = new LinkedHashMap<>();
        List<List<Integer>> ans = new ArrayList();
        dfs(root, levelMap, 1);
        Map<Integer, List<Map.Entry<TreeNode, Integer>>> sortMap = levelMap.entrySet().stream().sorted(
                Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.groupingBy(
                ele -> ele.getValue()));
        for (int index = 1; index <= sortMap.size(); index++) {
            List<Map.Entry<TreeNode, Integer>> list = sortMap.get(index);
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                temp.add(list.get(i).getKey().val);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void dfs(TreeNode node, Map levelMap, int depth) {
        if (node == null) {
            return;
        }
        levelMap.put(node, depth);
        dfs(node.left, levelMap, depth + 1);
        dfs(node.right, levelMap, depth + 1);
    }

