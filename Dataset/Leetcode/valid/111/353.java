 public int XXX(TreeNode root) {
   	        if(root == null){
   	            return 0;
   	        }
   	        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            int XXX = 0;
            queue.add(root);
            while(!queue.isEmpty()) {
            	XXX++;
            	int size = queue.size();
            	while(size-- > 0 && (root = queue.poll()) != null) {
            		if(isLeaf(root)) {
            			return XXX;
            		}
            		if(root.left != null) {
            			queue.add(root.left);
            		}
            		if(root.right != null) {
            			queue.add(root.right);
            		}
            	}
            }
   	        return XXX;
   	    }
    	   
    	private boolean isLeaf(TreeNode root) {
    		if(root.left == null && root.right == null) {
    			return true;
    		}
    		return false;
    	}

