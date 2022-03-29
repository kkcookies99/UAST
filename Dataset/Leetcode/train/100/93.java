  public boolean XXX(TreeNode p, TreeNode q) {
        // 如果同时为空了，那么到了末尾，表明相同
          if (p == null && q ==null){
              return true;
          }
          //如果上面不成立，到了这里表明一个空，一个不空，不相同
          if (p == null || q ==null){
              return false;
          }

          if (p.val != q.val){
              return false;
          }
          return XXX(p.left,q.left) && XXX(p.right,q.right);
    }

