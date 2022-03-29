 class Solution {
    public List<Integer> XXX(TreeNode root) {
         List<Integer> ss=new ArrayList<>();
         dfs(root,ss);
         return ss;

    }
    public static void dfs(TreeNode root,List<Integer> ss){
       if(root==null){
           return;
       }
       dfs(root.left,ss);
       ss.add(root.val);
       dfs(root.right,ss);
    }
}

