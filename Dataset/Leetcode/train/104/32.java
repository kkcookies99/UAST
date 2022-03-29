class Solution {
    public int XXX(TreeNode root) {
        return Depth(root,1);
    }
    public int Depth(TreeNode root,int h){
        if(root == null)
            return h-1;
        int lh = Depth(root.left,h+1);
        int rh = Depth(root.right,h+1);
        return Math.max(lh,rh);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


