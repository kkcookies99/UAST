 public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
                if ( root == null) {
                    return list;
                }
                TreeNode cur = root;
                //栈不为空的情况 是为了重新确定top的位置
                while (cur != null || !stack.empty()) {
                    while (cur != null) {
                        stack.push(cur);
                        cur = cur.left;
                    }
                    //栈顶的top可以弹出并记录是为了找到cur的右树
                    TreeNode top = stack.pop();
                    list.add(top.val);

                    //System.out.print( top.val+" ");   //注意比较和前序遍历 只是打印时候位置改变了         
                    cur = top.right;
                }
                return list;

    }

