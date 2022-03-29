class Solution {
    public int XXX(TreeNode root) {
if(root==null) return 0;
Queue<TreeNode> q =new LinkedList<>();
q.offer(root);
int depth=1;
while(!q.isEmpty()){
int sz=q.size();
    for(int i=0;i<sz;i++)
    {
        TreeNode cur=q.poll();
        if(cur.left==null&&cur.right==null)
        return depth;
        if(cur.left!=null) q.offer(cur.left);
         if(cur.right!=null) q.offer(cur.right);
    }
depth++;

}
  return depth; }
}


