class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		Queue<TreeNodeExt> queue = new LinkedList<>();
		Map<Integer,List<Integer>> map = new HashMap<>();
		queue.offer(new TreeNodeExt(1,root));
		while(!queue.isEmpty()){
			TreeNodeExt treeNodeExt = queue.poll();
			if(map.get(treeNodeExt.level) == null){
				List<Integer> tmpList = new ArrayList<>();
				tmpList.add(treeNodeExt.treeNode.val);
				map.put(treeNodeExt.level,tmpList);
			}else{
				map.get(treeNodeExt.level).add(treeNodeExt.treeNode.val);
			}
			if(treeNodeExt.treeNode.left!=null){
				queue.offer(new TreeNodeExt(treeNodeExt.level + 1,treeNodeExt.treeNode.left));
			}
			if(treeNodeExt.treeNode.right!=null){
				queue.offer(new TreeNodeExt(treeNodeExt.level + 1,treeNodeExt.treeNode.right));
			}
		}

		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		for(Integer res : list){
			result.add(map.get(res));
		}
		return result;
    }
}

class TreeNodeExt{

	public int level;

	public TreeNode treeNode;

	public TreeNodeExt(int level, TreeNode treeNode) {
		this.level = level;
		this.treeNode = treeNode;
	}
}

