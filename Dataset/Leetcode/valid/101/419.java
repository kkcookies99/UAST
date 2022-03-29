 public boolean XXX(TreeNode root) {
        if(root==null) return true; // 若根节点为空，则直接返回根节点

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>(); 

        //先将根节点的左右节点入队
        queue.add(root.left);
        queue.add(root.right);
        
        while(queue.size()>0){ // 每次从队列中取出两个节点进行比较
            TreeNode n1 = queue.remove();
            TreeNode n2 = queue.remove();

            if(n1==null && n2==null) 
                continue; // 若两个节点都为空，则判断队列中接下来两个节点
            if(n1==null || n2==null || n1.val!=n2.val) 
                return false; // 若存在只有一个节点为空，或两个节点值不相等，则不对称
            
            //否则依次将节点1和节点2镜像位置的子节点入队
            queue.add(n1.left);
            queue.add(n2.right);  

            queue.add(n1.right);
            queue.add(n2.left);           
        }
        return true;          
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


