class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        if (root == null) return bigList;

        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            //一次循环将一个父节点加入到list中，最后遍历完成后，一层的list完成装载
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left!=null) queue.add(cur.left);
                if (cur.right!=null) queue.add(cur.right);
            }
            bigList.add(list);
        }
        return bigList;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


