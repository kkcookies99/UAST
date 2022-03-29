     public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && XXX(root.left) && XXX(root.right);
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


