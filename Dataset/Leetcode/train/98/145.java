 public boolean XXX(TreeNode root) {
   if(root == null) return true;

    List<Integer> list = new ArrayList();
    inOrder(root,list);
    
    boolean result = true;
    for(int i = 0;i < list.size();i++){
        if(i < list.size() - 1){
            if(list.get(i) >= list.get(i + 1)){
                result = false;
                 break;
            }
            
        }
    }
    
    return result;
}

public void inOrder(TreeNode root,List<Integer> list){
    if(root == null) return;
    
    inOrder(root.left,list);
    list.add(root.val);
    inOrder(root.right,list);
}

