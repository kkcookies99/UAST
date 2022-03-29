 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null)return new ArrayList<>();
        int left=1;
        int nextLineNum=0;
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            left--;
            result.add(node.val);
            if(node.left!=null){
                queue.offer(node.left);
                nextLineNum++;
            }
            if(node.right!=null){
                queue.offer(node.right);
                nextLineNum++;
            }
            if(left==0){
                resList.add(result);
                result=new ArrayList<>();
                left=nextLineNum;
                nextLineNum=0;
            }
        }
        return resList;
    }
}

