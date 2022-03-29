var XXX = function(root) {
    if(root === null) return 0;
    let depth = 1;
    let stack = [root];
    let currentNode = root;
    
    while(stack.length) {
        while(getNotArrivedChild(currentNode)) {
            stack.push(getNotArrivedChild(currentNode));
            currentNode = getNotArrivedChild(currentNode);
            //这里给访问过的节点标记一下
            currentNode.ok = true;
            //如果加入这个节点后，stack长度大于当前depth，就更新depth为stack长度。
            if(stack.length > depth) depth = stack.length;
        }
        stack.pop();
        currentNode = stack[stack.length-1];
    }
    
    return depth;
};

//这个函数用来返回当前节点还未被访问过的子节点
function getNotArrivedChild(root) {
    if(root.left && !root.left.ok) return root.left;
    if(root.right && !root.right.ok) return root.right;
    return null;
}

