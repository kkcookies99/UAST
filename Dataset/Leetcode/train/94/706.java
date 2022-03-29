 public List<Integer> XXX(TreeNode root) {
        List<Integer> values = new ArrayList<Integer>();
        try{
            // 左节点遍历
            if(root.left != null){
                values.addAll(XXX(root.left));
            }

            // 中间节点
            values.add(root.val);

            // 右节点遍历
            if(root.right != null){
                values.addAll(XXX(root.right));
            }      
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        return values;
    }

