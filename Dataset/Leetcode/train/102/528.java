class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
         if(root==null) return new ArrayList<>();

        TreeNode[] queue =new TreeNode[10000]; //队列;
        int top=0,bottom=0;
        List<List<Integer>> list=new ArrayList<List<Integer>>() ; //申请存储空间;
        queue[bottom++]=root;   //根节点入队;
        int count=1;
        while(top!=bottom){   //出队列的条件;
              List<Integer> list1=new ArrayList<>();
              //top bottom本身在动态变化，直接使用时层级表示就没有意义了;

              for(int i=0;i<count;i++){  //每一层的遍历;
                  TreeNode node=queue[top++]; //取队头;
                  list1.add(node.val);
                  if(node.left!=null){
                      queue[bottom++]=node.left;
                  }

                  if(node.right!=null){
                      queue[bottom++]=node.right;
                  }
             }
             count=bottom-top;
             
              
             list.add(list1);
        }
        return list;
    }
}

