class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            res.add(new ArrayList<>());
            for (int i = 0; i < n; i ++ ) {
                var t = q.poll();
                res.get(res.size() - 1).add(t.val);
                if (null != t.left) q.offer(t.left);
                if (null != t.right) q.offer(t.right);
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


