class Solution {
    public int XXX(TreeNode root) {
        HashSet<Integer> search = new HashSet<>();
        if(root == null){
            return 0;
        }
        int dept = 1;
        test(root,search,dept);
        int max = 0;
        for(int temp:search){
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }

    public void test(TreeNode root,HashSet search,int dept){
        if(root.left==null && root.right==null){
            search.add(dept);
            return;
        }
        if(root.right!=null){
            test(root.right,search,dept+1);
        }
        if(root.left!=null){
            test(root.left,search,dept+1);
        }

    }
}

