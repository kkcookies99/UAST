 class Solution {
    public boolean XXX(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();//装节点
        List<Integer> result=new LinkedList<>();//装顺序
        if(root==null) return false;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.peek();
            if(node!=null){
                stack.pop();
                if (node.right!=null) stack.push(node.right);//非空就加进去
                stack.push(node);
                stack.push(null);//做标记
                if (node.left!=null) stack.push(node.left);//非空就加进去
            }
            else{//处理节点
                stack.pop();//先把null节点扔了
                TreeNode cur=stack.pop();
                result.add(cur.val);
            }
        }
        int r[]=result.stream().mapToInt(Integer::valueOf).toArray();  //转int数组采用流式处理Stream进行处理
        for(int i=1;i<r.length;i++)//判断升序
            if(r[i]<=r[i-1]) return false;
        return true;
        }
}

