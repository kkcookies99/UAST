 class Solution {
    ArrayList<Integer>list=new ArrayList();
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        //中序遍历，形成有序链表
        return midOrder(root);
    }
    public boolean midOrder(TreeNode root){
        Stack<TreeNode>stack=new Stack();
        TreeNode p=root;
        while(p!=null||!stack.empty()){
            if(p!=null){
                stack.push(p);//先缓存p,再向左访问
                p=p.left;
            }
            else{
                p=stack.pop();
                int size=list.size();
                if(size==0||list.get(size-1)<p.val)//在中序遍历的过程中如果发现非递增，则直接返回false
                   list.add(p.val);
                else return false;
                p=p.right;
            }
        }
        return true;
    }
}

