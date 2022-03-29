 public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        String s1 = encodeTree(p);
        String s2 = encodeTree(q);
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int[] next = getNext(s2);
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (j == -1 || s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        return j >= s2.length();
    }

    public String encodeTree(TreeNode root) {
        if (root == null)
            return "#";
        String rs = "_" + root.val + "_";
        rs += encodeTree(root.left);
        rs += encodeTree(root.right);
        return rs;
    }

    public int[] getNext(String str) {
        if (str.length() == 0)
            return new int[] {};
        int[] rs = new int[str.length()];
        rs[0] = -1;
        int k = -1;
        int i = 0;
        while (i < rs.length - 1) {
            if (k == -1 || rs[i] == rs[k]) {
                i++;
                k++;
                rs[i] = k;
            } else
                k = rs[k];
        }
        return rs;
    }

