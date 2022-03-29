 var XXX = function(root) {
    if(!root) return true
    return isSame(root.left,root.right)
}
let isSame = (leftTree,rightTree)=>{
    if(leftTree == null && rightTree == null) return true
    if(leftTree == null || rightTree == null || leftTree.val != rightTree.val) return false
    return isSame(leftTree.left,rightTree.right) && isSame(leftTree.right,rightTree.left)
}

