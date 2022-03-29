 class Solution {
    public List<Integer> XXX(TreeNode root) {
        //要有双层循环，先左后右，先序中序后序都是这样
        //先序遍历:每次都取值，然后左，左完了再右出
        //中序遍历:一直左，直到要右出了，先取值，再右出
        //用栈来存储要处理的树，因为LIFO
        List<Integer> result= new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(root!=null || !stack.isEmpty()){//当前节点非空，或者还有树没有遍历完
            while(root!=null){//当前节点值得遍历
                stack.push(root);//当前节点可以遍历，那么就加入栈中
                root=root.left;
            }
            //当前节点为空，说明上一个节点只有右
            //上一个节点再遍历一下右，那么也就要从栈中出去了
            root=stack.pop();
            result.add(root.val);//节点不为空必定有值，右之前再取值
            root=root.right;
        }
        return result;
    }
}

