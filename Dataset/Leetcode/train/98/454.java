     public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return find(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean find(TreeNode root, long st, long end) {
        boolean a = true;
        boolean b = true;
        int value = root.val;
        if (root.left != null) {
            int l = root.left.val;
            if (l < value && l > st) {
                a = find(root.left, st, value);
            } else {
                return false;
            }
        } 
        if (root.right != null) {
            int l = root.right.val;
            if (l > value && l < end) {
                b =  find(root.right, value, end);
            } else {
                return false;
            }
        }
        return a && b;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


