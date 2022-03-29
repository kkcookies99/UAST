 var XXX = function(root, targetSum) {
    if(root === null){
        return false;
    }
    var tempVal = targetSum - root.val;
    if(root.left === null && root.right === null && tempVal===0){
        return true;
    }
    return XXX(root.left,tempVal)||XXX(root.right, tempVal);
};

