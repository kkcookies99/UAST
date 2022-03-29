 var XXX = function(p, q) {
    //1.一开始如果都为空树的话，返回值true
    //2.如果左右子树遍历完为空，返回值true&&true=true
    if(!p&&!q) return true;
    //1.一开始左右子树有一为空树，直接返回false
    //2.如果遍历过程中左右子树有一书遍历完返回情况false&&false、false&&true、true&&false = false 
    //注意：因为这是递归有返回值会往回退
    if(!p||!q) return false;
    //如果p和q遍历的过程中找到不相等的直接一边返回false,返回情况flase&&false、false&&true、true&&false=false
    if(p.val!==q.val) return false;
    return XXX(p.left,q.left)&&XXX(p.right,q.right);
}
//思路：二叉树的遍历，需要返回值递归

