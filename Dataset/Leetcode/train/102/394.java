public List<List<Integer>> XXX(TreeNode root) {



    List<List<Integer>> ans = new ArrayList<>();

    if(root==null){
        return ans;
    }

    List<TreeNode> queue = new ArrayList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

      List<Integer> list = new ArrayList<>();
      List<TreeNode> nextQueue = new ArrayList<>();

      for (int i = 0; i < queue.size(); i++) {

        if (queue.get(i).left != null) {
          nextQueue.add(queue.get(i).left);
        }
        if (queue.get(i).right != null) {
          nextQueue.add(queue.get(i).right);
        }

        list.add(queue.get(i).val);
      }
      ans.add(list);

      queue.clear();
      queue.addAll(nextQueue);
    }

    return ans;
  }

