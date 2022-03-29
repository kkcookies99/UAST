 var XXX = function(root) {
    if(!root) return true
    let stack = []
    stack.push(root.left)
    stack.push(root.right)
    while(stack.length){
        let rightTree = stack.pop()
        let leftTree = stack.pop()
        if(rightTree == null && leftTree == null) continue
        if(rightTree == null || leftTree == null || leftTree.val != rightTree.val) return false
        stack.push(leftTree.left)
        stack.push(rightTree.right)
        stack.push(rightTree.left)
        stack.push(leftTree.right)
    }
    return true
}

