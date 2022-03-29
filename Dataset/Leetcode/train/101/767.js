 var XXX = function(root) {
    var leftStack = [], rightStack = []
    if(root == null){
        return true;
    }
    var root1 = root.left, root2 = root.right;
    while(leftStack.length ||root1 || root2){
        while(root1){
            leftStack.push(root1)
            root1 = root1.left;
        }
        while(root2){
            rightStack.push(root2)
            root2 = root2.right;
        }  
        if(leftStack.length != rightStack.length)  return false;
        root1 = leftStack.pop();
        root2 = rightStack.pop();
        if(root1.val != root2.val){
            return false;
        }
        root1 = root1.right;
        root2 = root2.left;
    }
    return true;
}

