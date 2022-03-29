     public boolean XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOrder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void midOrder(TreeNode root,List<Integer> list){
        if(root.left!=null){
            midOrder(root.left,list);
        }
        if(root!=null){
            list.add(root.val);
        }
        if(root.right!=null){
            midOrder(root.right,list);
        }
    }

