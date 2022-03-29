 public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> tmp = new HashMap<>();
        if(root == null){
            return result;
        }
        helper(root, tmp, 0);
        for (Map.Entry<Integer, List<Integer>> map : tmp.entrySet()) {
            result.add(map.getValue());
        }
        return result;

    }

    private void helper(TreeNode root, Map<Integer, List<Integer>> tmp, int i) {
        List<Integer> tmplist = tmp.getOrDefault(i, new ArrayList<>());
        tmplist.add(root.val);
        tmp.put(i, tmplist);
        
        if(root.left != null){
            i++;
            helper(root.left, tmp, i);
            i--;
        }
        if(root.right != null){
            i++;
            helper(root.right, tmp, i);
            i--;
        }
    }

