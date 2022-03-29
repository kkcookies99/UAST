 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root==null)return new ArrayList<>();
        ArrayList<MyTreeNode> list = new ArrayList<>();
        Queue<MyTreeNode> queue = new LinkedList<MyTreeNode>();
        queue.offer(new MyTreeNode(root,0));
        while(queue.peek()!=null){
            MyTreeNode myTreeNode = queue.poll();
            list.add(myTreeNode);
            if(myTreeNode.node.left!=null){
                queue.offer(new MyTreeNode(myTreeNode.node.left,myTreeNode.layer+1));
            }
            if(myTreeNode.node.right!=null){
                queue.offer(new MyTreeNode(myTreeNode.node.right,myTreeNode.layer+1));
            }
        }
        return process(list);
    }
    public List<List<Integer>> process(ArrayList<MyTreeNode> list){
        List<List<Integer>> resList = new ArrayList<>();
        int index=1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(list.get(0).node.val);
        if (list.size()==1){
            resList.add(arrayList);
            return resList;
        }
        int l=list.get(0).layer;
        while(index<list.size()){
            while(list.get(index).layer==l){
                arrayList.add(list.get(index).node.val);
                index++;
                if (index==list.size()){
                    break;
                }
            }
            if (index!=list.size()){
                l=list.get(index).layer;
            }
            resList.add(arrayList);
            arrayList=new ArrayList<>();
        }
        return resList;
    }
}
class MyTreeNode{
    TreeNode node;
    int layer;
    public MyTreeNode(TreeNode node, int layer) {
        this.node = node;
        this.layer = layer;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


