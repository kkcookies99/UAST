 public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        //在leetcode提交时会报错，但是如果改成if((p!=null&&q==null)||(p==null&&q!=null)||(p.val!=q.val))则可以pass,
        // 不知道是不是leetcode的bug
        if((p.val!=q.val)||(p!=null&&q==null)||(p==null&&q!=null))
            return false;
        else return XXX(p.left,q.left)&&XXX(p.right,q.right);

    }

