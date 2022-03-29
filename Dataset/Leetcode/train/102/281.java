public List<List<Integer>> XXX(TreeNode root) {
         List<List<Integer>> list = new ArrayList<>();
        // 空树直接返回
        if(root == null) return list;
        // 每一层的节点个数 初始根节点有一个
        int count = 1;
        // 每层的链表
        List<Integer> lev = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            // 取出队头节点
            TreeNode curr = queue.poll();
            // 节点存储的值入队
            lev.add(curr.val);
            count--;
            if(curr.left!=null) queue.offer(curr.left);
            if(curr.right!=null) queue.offer(curr.right);

            // count为0 则当前层遍历玩了
            if(count==0){
                count = queue.size();
                // 当前层的链表入集合
                // 注意：必须将lev链表拷贝一份，不然list里面存储的只是lev的地址。一旦清空就会元素消失
                list.add(new LinkedList<>(lev));
                // 清空存储每层元素的链表
                lev.clear();
            }
        }
        return list;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


