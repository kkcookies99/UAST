public List<List<Integer>> XXX(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        // 边界处理
        if(root ==null){
            return result;   
        }
        // 初始化当前层
        List<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root);
        List<TreeNode> nextLevel = new LinkedList<>();
        XXXHelper(result,currentLevel,nextLevel);
        return result;

    }

    public void XXXHelper(List<List<Integer>> result, List<TreeNode> currentLevel,
                                 List<TreeNode> nextLevel){
        // 停止条件                             
        if(currentLevel.size()==0){
            return;
        }
        List<Integer> currentLevelResult = new LinkedList<>();
        // 遍历当前层 放入下一层节点
        for(TreeNode node : currentLevel){
            currentLevelResult.add(node.val);
            if(node.left!=null){
                nextLevel.add(node.left);
            }
            if(node.right!=null){
                nextLevel.add(node.right);
            }
        }
        result.add(currentLevelResult);
        // 进入下一层
        XXXHelper(result,nextLevel,new LinkedList<>());

    }

