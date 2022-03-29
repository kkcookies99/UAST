 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack=new Stack<TreeNode>(); //利用栈来模拟根节点的先进后出
        List<Integer> list=new ArrayList<Integer>(); //list来装遍历的结点、
        TreeNode r=root; //r来装当前的结点
        while(r!=null||!stack.isEmpty()){         
            if(r==null){ 
                r=stack.pop();
                list.add(r.val);
                r=r.right;  //如果右子树为空 则出栈
            }else{          //如果r!=null 则将该结点进栈 再遍历左子树
                stack.push(r);
                r=r.left;
            }
        }
        return list;
    }
}

