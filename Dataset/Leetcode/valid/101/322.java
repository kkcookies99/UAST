 public boolean XXX(TreeNode root) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        it1(root, sb1);
        it2(root, sb2);
        return Objects.equals(sb1.toString(), sb2.toString());
    }

    private void it1(TreeNode root, StringBuilder sb1) {
        if (root == null) {
            sb1.append("n");
            return;
        }
        sb1.append(root.val);
        it1(root.left, sb1);
        it1(root.right, sb1);
    }
    private void it2(TreeNode root, StringBuilder sb2) {
        if (root == null) {
            sb2.append("n");
            return;
        }
        sb2.append(root.val);
        it2(root.right, sb2);
        it2(root.left, sb2);
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


