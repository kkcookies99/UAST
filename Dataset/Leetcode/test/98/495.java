 class Solution {
    public boolean XXX(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        help(root,list);
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void help(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        help(root.left,list);
        list.add(root.val);
        help(root.right,list);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


