  public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        List<TreeNode> subListPar = new ArrayList<TreeNode>();
        subListPar.add(root);
        getSubList(subListPar,list);
        return list;
    }
    public void getSubList(List<TreeNode> subListPar,List<List<Integer>> list){
       if(subListPar.size()==0) return;
       List<TreeNode> subListSon = new  ArrayList<TreeNode>();
       List<Integer> subval = new ArrayList<Integer>();
       for(TreeNode node:subListPar){
           if(node.left!=null) subListSon.add(node.left);
           if(node.right!=null) subListSon.add(node.right);
           subval.add(node.val);
       }
       list.add(subval);
       getSubList(subListSon,list);
    }

