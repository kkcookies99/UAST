 var XXX = function(root) {
    if(root==null)
        return true;
    var dfs=function(node,i){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return i;
        }
        var left=dfs(node.left,i+1),
            right=dfs(node.right,i+1);
        return left>right?left:right;
    }
    var pd=function(node){
        if(node==null){
            return true;
        }
        if(node.left==null&&node.right==null){
            return true;
        }
        if(Math.abs(dfs(node.left,1)-dfs(node.right,1))>1){
            return false;
        }
        return pd(node.left)&&pd(node.right);
    }
    return pd(root);
};

