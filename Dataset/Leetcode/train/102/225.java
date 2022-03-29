class Solution {

    private class MyTreeNode {
        TreeNode node;
        Integer layer;
        MyTreeNode(TreeNode node,Integer layer){
            this.node = node;
            this.layer = layer;
        }
    }

    public List<List<Integer>> XXX(TreeNode root) {
        if(root == null) return Collections.emptyList();
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> layerList = new ArrayList<>();
        Deque<MyTreeNode> dq = new ArrayDeque<>();
        dq.addLast(new MyTreeNode(root,0));
        Integer lastLayer = 0;
        while(dq.size()!=0){
        MyTreeNode myNode = dq.pollFirst();
        if(myNode.layer!=lastLayer){
            lastLayer = myNode.layer;
            ret.add(layerList);
            layerList = new ArrayList<>();
        }
        layerList.add(myNode.node.val);
        if(myNode.node.left!=null) dq.addLast(new MyTreeNode(myNode.node.left,myNode.layer+1));
        if(myNode.node.right!=null) dq.addLast(new MyTreeNode(myNode.node.right,myNode.layer+1));
        }
        ret.add(layerList);
        return ret;
    }
}

