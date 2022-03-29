 public boolean XXX(TreeNode root) {

        //对于镜像(满)二叉树来说 根左右和根右左得到的遍历结果是一样的 1ms 24.35%
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preOrder(root,list1);
        OsPreOrder(root,list2);
        if(list1.size() != list2.size()) return false;
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }

    public void preOrder(TreeNode root,List<Integer> list){
        if(root == null){
            //不是满二叉树就填补
            list.add(-1);
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }

    public void OsPreOrder(TreeNode root,List<Integer> list){
        if(root == null){
            //不是满二叉树就填补
            list.add(-1);
            return;
        }
        list.add(root.val);
        OsPreOrder(root.right,list);
        OsPreOrder(root.left,list);
    }

