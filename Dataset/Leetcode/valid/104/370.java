    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        int height = 0;
        while (ll.size() != 0) {
            int size = ll.size();
            while (size > 0) {
                TreeNode tn = ll.poll();
                if (tn.left != null) {
                    ll.add(tn.left);
                }
                if (tn.right != null) {
                    ll.add(tn.right);
                }
                size--;
            }
            height++;
        }
        return height;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


