 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<>();
        
        TreeNode temp=root;
        while(temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                TreeNode cur=stack.pop();
                list.add(cur.val);
                temp=cur.right;
            }
        }
        return list;
    }
}

