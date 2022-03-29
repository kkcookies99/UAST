class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
        int floor = 0;
        Queue<TreeNode> q=new LinkedList<>();
        root.val=1001;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode head=q.poll();
            boolean sCR=true;
            if(head.val==1001){
                floor++;
            }
            if(head.left!=null){
                q.offer(head.left);
                if(head.val==1001){
                    head.left.val=1001;
                }
                sCR=false;
            }
            if(head.right!=null){
                q.offer(head.right);
                if(sCR&&head.val==1001){
                    head.right.val=1001;
                }
            }else if(head.left==null){
                break;
            }
        }
        return floor;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


