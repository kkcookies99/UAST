    public List<List<Integer>> XXX(TreeNode root) {
 
        //定义返回结果
        List<List<Integer>> result = new ArrayList<>();
		//判断根节点是否为null
        if(root == null){
            return result;
        }
        
        //一、定义第一个集合，先把根节点放进去就
        List<Integer> rootList = new ArrayList();
        rootList.add(root.val);
        result.add(rootList);

        //把根节点上一层元素的list
        List<TreeNode> upperStoryNodeList = new ArrayList<>();
        //把root放到上一行集合
        upperStoryNodeList.add(root);
        
        //二、定义变量
        //要加入到返回结果的list
        List<Integer> resultNumberList = null;


        List<TreeNode> currentNodeList  = null;
        do{
            currentNodeList = new ArrayList<>();
            resultNumberList = new ArrayList();


            for(TreeNode treeNode : upperStoryNodeList){
                if(treeNode.left != null){
                    currentNodeList.add(treeNode.left);
                    resultNumberList.add(treeNode.left.val);
                }
                if(treeNode.right != null){
                    currentNodeList.add(treeNode.right);
                    resultNumberList.add(treeNode.right.val);
                }
            }
            if(!resultNumberList.isEmpty()){
                result.add(resultNumberList);
            } 
      
            upperStoryNodeList= currentNodeList;

        }while(!currentNodeList.isEmpty());
        return result;
    }

