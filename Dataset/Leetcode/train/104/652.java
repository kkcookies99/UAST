 public int XXX(TreeNode root) {
        
        return count(0,root);
    }
    
    private int count(int depNum, TreeNode root){
        if(root == null){
            return depNum;
        }
        
        depNum++; 
        int leftNum = count(depNum,root.left);
        int rightNum = count(depNum,root.right);
        
        return Math.max(leftNum,rightNum);
    }

