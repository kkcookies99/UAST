 public int XXX(TreeNode root) {
        if (root==null) return 0;
        return XXX(root.left,root.right,1);
    }

     public int XXX(TreeNode node1,TreeNode node2,int i) {
        if (node1==null && node2 == null) return i;
        i++;
        int i1=i, i2=i;
        if (node1 != null) i1 = XXX(node1.left, node1.right, i1);
        if (node2 != null) i2 = XXX(node2.left,node2.right,i2);
        return Math.max(i1,i2);
    }

