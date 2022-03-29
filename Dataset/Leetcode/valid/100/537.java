 public boolean XXX(TreeNode p, TreeNode q) {
        List<String> p1 = isTN(p);
        List<String> p2 = isTN(q);
        if(p1.equals(p2)){
            return true;
        }
        return false;
    }

    public List<String> isTN(TreeNode p){
        List<String> tn = new ArrayList<>();
        tn.add(p == null?"null":String.valueOf(p.val));
        if(p == null){
            return tn;
        }
        tn.add(p.left == null?"null":String.valueOf(p.left.val));
        tn.add(p.right == null?"null":String.valueOf(p.right.val));
        tn.addAll(isTN(p.left));
        tn.addAll(isTN(p.right));
        return tn;
    }

