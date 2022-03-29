 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> queuelist = new LinkedList<>();
        queuelist.offer(root);
        while(!queuelist.isEmpty()){
            int size = queuelist.size();
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                TreeNode tmp = queuelist.poll();
                if(tmp!=null){
                    arr[i] = tmp.val;
                    queuelist.offer(tmp.left);
                    queuelist.offer(tmp.right);
                }else{
                    arr[i] = -1;
                }             
            }
            for(int i=0;i<size/2;i++){
                if(arr[i]!=arr[size-i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}

