 class Solution {
    public void traversal(TreeNode cur,List<Integer> result){
        if(cur==null) return;//终止条件
        traversal(cur.left,result);//左
        result.add(cur.val);//中
        traversal(cur.right,result);//右
    }
    public boolean XXX(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        traversal(root,result);
        int r[]=result.stream().mapToInt(Integer::valueOf).toArray();  //转int数组采用流式处理Stream进行处理
        for(int i=1;i<r.length;i++)//判断升序
            if(r[i]<=r[i-1]) return false;
        return true;
    }
}

