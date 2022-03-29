 public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        boolean flag = false;
        while (root != null || !stack.isEmpty()){
            //如果当前节点为空，则从栈里取出新的节点，并将flag置为true
            if (root == null){
                root = stack.removeLast();
                flag = true;
            }
            //若当前节点不为空且不是从栈里取出的元素，将当先节点入栈，并让当前节点指向做子树
            else if (!flag){
                stack.addLast(root);
                root = root.left;
            }
            //当前节点是从栈里取出的，将当前元素加入结果集，当前节点指向右子树，并将flag置为false
            else {
                res.add(root.val);
                root = root.right;
                flag = false;
            }
        }

        return res;
    }

