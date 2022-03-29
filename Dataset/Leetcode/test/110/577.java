class Solution {
    public boolean XXX(TreeNode root) {
      return gg(root).f;
    }
    public node gg(TreeNode root){
       if(root==null){
           return new node(0,true);
       }
       node left=gg(root.left);
       if(left.f==false){
           return left;
       }
       node right=gg(root.right);
       if(right.f==false){
           return right;
       }
       if(Math.abs(left.d-right.d)>1){
           return new node(0,false);
       }
       return new node(Math.max(left.d,right.d)+1,true);

    }
    public class node{
        int d;
        boolean f;
        node(int d,boolean f){
            this.d=d;
            this.f=f;
        }
    }
}

