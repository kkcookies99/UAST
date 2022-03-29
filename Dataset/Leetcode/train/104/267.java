class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> atk = new LinkedList<TreeNode>();
        int ans = 0;
        atk.offer(root);
        while(!atk.isEmpty()){
            int siz = atk.size();
            while(siz>0){
                TreeNode node = atk.poll();
                if(node.left!=null){
                    atk.offer(node.left);
                }
                if(node.right!=null){
                    atk.offer(node.right);
                }
                siz--;
            }
            ans++;
        }
        return ans;
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


