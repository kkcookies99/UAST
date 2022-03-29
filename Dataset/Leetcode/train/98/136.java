 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) 
		{
			return true;
		}
		Stack<TreeNode> stack= new Stack<>();
		List<Integer> list = new ArrayList<>();
		TreeNode p=root;
		stack.add(root);
		while(stack.isEmpty()==false) 
		{
			if(p!=null && p.left!=null) 
			{
				stack.add(p.left);
				p=p.left;
			}else
			{
				p=stack.pop();
				list.add(p.val);
				if(p!=null && p.right!=null)
				{
					stack.add(p.right);
					p=p.right;
				}
				else
				{
					p=null;
				}
			}
		}
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)>=list.get(i+1))
			{
				return false;
			}
			
		}
		return true;
        
    }
}

