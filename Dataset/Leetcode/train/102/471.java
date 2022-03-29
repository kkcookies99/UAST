class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
       List<List<Integer>> result=new ArrayList<List<Integer>>();
       if(root==null){
           return result;
       }
       LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
       queue.addLast(root);
       queue.addLast(null);
       List<Integer> list=new ArrayList<Integer>();
       while(queue.size()>1){
           TreeNode node=queue.removeFirst();
           if(node==null){
               result.add(list);
               list=new ArrayList<Integer>();
               queue.addLast(null);
               continue;
           }
           list.add(node.val);
           if(node.left!=null){
               queue.addLast(node.left);
           }
           if(node.right!=null){
               queue.addLast(node.right);
           }           
       }
       result.add(list);
       return result;
    }
}

