     public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        TreeNode node = root;
        //迭代算法 中序 左 根 右， 先把根缓存起来被
        Stack<TreeNode> stack = new Stack<>();
        // stack.push(node);

        while(!stack.isEmpty() ||   node !=null){
            //找到最左边的元素
            while(node.left!=null){
                stack.push(node);
                node = node.left;
            }
            //这个节点,没有左子了，就把他先放入队列中
            list.add(node.val);

            
            while(node.right == null && !stack.isEmpty()){
                node = stack.pop();
                list.add(node.val);
            }
            node = node.right;
        }

        return list;
    }

