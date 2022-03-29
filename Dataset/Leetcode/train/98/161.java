 class Solution {
   
    long pre = Long.MIN_VALUE;
    public  boolean XXX(TreeNode p) {
        if (p != null) {
            if (!XXX(p.left))  return false;
            if (p.val <= pre) return false;
            pre = p.val;
            if (!XXX(p.right)) return false;
           
        }
        return true;
    } 
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


