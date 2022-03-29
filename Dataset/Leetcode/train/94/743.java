 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)  return list;
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left!=null){
                TreeNode pre=cur.left;
                while(pre.right!=null&&pre.right!=cur){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=cur;
                    cur=cur.left;
                }
                if(pre.right==cur){
                    pre.right=null;
                    list.add(cur.val);
                    cur=cur.right;
                }
            }else{
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
}

