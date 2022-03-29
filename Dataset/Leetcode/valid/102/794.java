 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return recursive(root, 0, new ArrayList<>());
    }
    
    private List<List<Integer>> recursive(TreeNode root, int level, List<List<Integer>> result) {

        if (result.size() == level) {
            result.add(new ArrayList<>());
        } 
        result.get(level).add(root.val);


        if (root.left != null) {
            recursive(root.left, level + 1, result);
        }

        if (root.right != null) {
            recursive(root.right, level + 1, result);
        }

        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


