     public List<Integer> XXX(TreeNode root) {
       if (root == null) return new ArrayList<>();
       List<Integer> list = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode curNode = root;
       while (curNode != null || !stack.isEmpty()) {
           if (curNode != null) {
               stack.push(curNode);
               curNode = curNode.left;
           } else {
               TreeNode pop = stack.pop();
               list.add(pop.val);
               curNode = pop.right;
           }
       }
       return list;
    }

