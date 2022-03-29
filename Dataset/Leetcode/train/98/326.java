 class Solution {
    public boolean XXX(TreeNode root) {
        return process(root,null,null);

    }

    public boolean process(TreeNode head, Integer lower, Integer upper){
        if(head==null){return true;}//这个必须写在下面的函数里

        int val = head.val;
        if(lower!=null && val <= lower){return false;}
        if(upper!=null && val>=upper){return false;}

        if(!process(head.right,val,upper)){return false;}
        if(!process(head.left,lower,val)){return false;}
        return true;//这里要return true别忘了

    }
}

