    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        res.add(Collections.singletonList(root.val));
        List<List<Integer>> leftRes = XXX(root.left);
        List<List<Integer>> rightRes = XXX(root.right);
        int maxSize = Math.max(leftRes.size(), rightRes.size());
        for (int i = 0; i < maxSize; i++) {
            List<Integer> list = new ArrayList<>();
            if (i < leftRes.size()) {
                list.addAll(leftRes.get(i));
            }
            if (i < rightRes.size()) {
                list.addAll(rightRes.get(i));
            }
            res.add(list);
        }
        return res;
    }

