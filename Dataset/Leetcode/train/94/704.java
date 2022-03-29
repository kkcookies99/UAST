     public List<Integer> XXX(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){return ans;}
        TreeNode cur = root;
        TreeNode mostRight = null;
        while(cur!=null){
            mostRight = cur.left;
            if(mostRight!=null){
                while(mostRight.right!=null && mostRight.right != cur){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }else{
                    mostRight.right = null;
                }
            }
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
    }

