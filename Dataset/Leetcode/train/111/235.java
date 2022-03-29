    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) { // 两边都是null
            return 1;
        } else if (root.left == null) { // 一边是null
            return XXX(root.right) + 1;
        } else if (root.right == null) { // 一边是null
            return XXX(root.left) + 1;
        } else { // 两边都不是null
            return Math.min(XXX(root.left), XXX(root.right)) + 1;
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


