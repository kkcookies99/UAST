class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        Deque<Integer> deque = new LinkedList<>();
        return XXXAUX(root, deque, targetSum);
    }

    private boolean XXXAUX(TreeNode root, Deque<Integer> deque ,int targetSum){
        if (root == null){
            return false;
        }

        if (deque.isEmpty()){
            deque.offerLast(root.val);
        }else{
            deque.offerLast(deque.peekLast() + root.val);
        }

        if (root.left == null && root.right == null){
            if (deque.peekLast() == targetSum){
                return true;
            }
        }

        if (root.left != null){
            if (XXXAUX(root.left, deque, targetSum)){
                return true;
            }
            deque.pollLast();
        } 

        if (root.right != null){
            if (XXXAUX(root.right, deque, targetSum)){
                return true;
            }
            deque.pollLast();
        }

        return  false; 
    }

}```

