class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        if(root==null) return resultList;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> itemList=new ArrayList<Integer>();
            int len=queue.size();
            while(len>0) {
                TreeNode node=queue.poll();
                itemList.add(node.val);
                len--;
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            resultList.add(itemList);
        }
        return resultList;
    }

