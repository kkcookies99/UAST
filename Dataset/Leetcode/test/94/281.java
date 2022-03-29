 class Solution {
    public List<Integer> XXX(TreeNode root) {
            List<Integer> res=new ArrayList<>();
            //类似与栈
            List<TreeNode> check=new ArrayList<>();
            TreeNode a=root;
            while(a!=null || check.size()!=0){
                // for(TreeNode c :stack){
                //     System.out.println(c.val);
                // }
                if(a!=null){
                    check.add(a);
                    a=a.left;
                }
                else{
                    a=check.get(check.size()-1);
                    check.remove(check.size()-1);
                    res.add(a.val);
                    a=a.right;
                     
                }
            }
            return res;
    }
   
}

