 public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList();
        traversal(root,result);
        return result;
    }
    public void traversal(TreeNode root,List<Integer> result){
        if(root == null){
            return ;
        }
        if(root.left != null){
            traversal(root.left,result);
        }
        result.add(root.val);
        if(root.right != null){
            traversal(root.right,result);
        }
    }

