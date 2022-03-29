class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        XXX(root,answer,0);
        return answer;
    }

    public void XXX(TreeNode root,List<List<Integer>> answer,int n){
        if(root == null){
            return;
        }
        if(answer.isEmpty() || answer.size()<=n){
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            answer.add(list);
        }
        else{
            answer.get(n).add(root.val);
        }
        XXX(root.left,answer,n+1);
        XXX(root.right,answer,n+1);
    }
}```
