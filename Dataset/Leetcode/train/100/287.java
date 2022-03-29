 public boolean XXX(TreeNode p, TreeNode q) {
            if(p == null)
                return q == null;
            if(q == null)
                return p == null;

            if(p.val != q.val)
                return false;
            else
                return XXX(p.left, q.left) && XXX(p.right, q.right);
        }

