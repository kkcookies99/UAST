public List<List<Integer>> XXX(TreeNode root) { 
		 List<List<Integer>> list = new ArrayList<>();
		 if (root == null) {
			 return list;
		 }
		 LinkedList<TreeNode> q = new LinkedList<>();
		 q.offer(root);
		 q.offer(null);
		 int index = 1;
		 List<Integer> row = null;
		 while(!q.isEmpty()) {
			 root = q.pollFirst();
			 if (root == null) {
                                 if (q.size() == 0) {
					 break;
				 }
				 q.offer(null);
				 index ++;
				 continue;
			 }
			 if (list.size() < index) {
				 row = new ArrayList<Integer>();
				 row.add(root.val);
				 list.add(row);
			 } else {
				 row = list.get(index - 1);
				 row.add(root.val);
			 }

			 if (root.left != null) {
				 q.offer(root.left);
			 }
			 if (root.right != null) {
				 q.offer(root.right);
			 }
			 
		 }
		 return list;
     }

