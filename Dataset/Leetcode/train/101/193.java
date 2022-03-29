 public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return iterate(root.left,root.right);
    }

    //递归方法
    public boolean dfs(TreeNode left, TreeNode right){
        if(left == null){
            return right == null;
        }
        if(right == null){
            return left == null;
        }
        return left.val == right.val && dfs(left.left,right.right) && dfs(left.right,right.left);
    }

    //迭代方法
    public boolean iterate(TreeNode left, TreeNode right){
        LinkedList<TreeNode> stackLeft = new LinkedList();
        LinkedList<TreeNode> stackRight = new LinkedList();
        while((!stackLeft.isEmpty() && !stackRight.isEmpty()) || left != null || right != null){
            while(left != null && right != null){
                stackLeft.push(left);
                stackRight.push(right);

                left = left.left;
                right = right.right;
            }

            if((left == null && right != null) || (left != null && right == null)){
                return false;
            }

            TreeNode leftNode = stackLeft.pop();
            TreeNode rightNode = stackRight.pop();

            if(leftNode.val != rightNode.val){
                return false;
            }

            left = leftNode.right;
            right = rightNode.left;
        }
        return true;
    }

