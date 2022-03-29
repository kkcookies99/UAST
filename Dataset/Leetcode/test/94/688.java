 public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();

            if(root == null) {
                return list ;
            }

            List<Integer> left  =     XXX(root.left);
            list.addAll(left);

            list.add(root.val);      


            List<Integer> right  =     XXX(root.right);
            list.addAll(right);

            return list;
    }

