public List<List<Integer>> XXX(TreeNode root) {
        ArrayList<List<Integer>> result =new ArrayList<>();
        if(root ==null ) return result;
        getResult(root,result,1);
        return result;
    }
    
    void getResult(TreeNode root,ArrayList<List<Integer>> result,int depth) {
        
        if(root==null) return;
        
        if(result.size()<depth) {
            result.add(new ArrayList<>());
        }
        result.get(depth-1).add(root.val);
        
        getResult(root.left,result,1+depth);
        getResult(root.right,result,1+depth);
    }

