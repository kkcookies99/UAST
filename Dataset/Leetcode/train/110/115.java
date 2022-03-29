        public boolean XXX(TreeNode root) {
            try {
                height(root);
                return true;
            }catch (Exception e){
                return false;
            }
        }
        public int height(TreeNode root){
            if (root == null)return 0;
            int left = height(root.left);
            int right = height(root.right);
            if (Math.abs(left-right)>1)throw new RuntimeException("");
            return Math.max(left,right)+1;
        }

