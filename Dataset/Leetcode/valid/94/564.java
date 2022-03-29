     public List<Integer> XXX(TreeNode root) {
         if(root == null){
             return ans;//****②*****return null;
         }
         XXX(root.left);
         ans.add(root.val);
         XXX(root.right);
         return ans;
    }

