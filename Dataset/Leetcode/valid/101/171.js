 var XXX = function(root) {
    return isSymbol(root,root);
};

function isSymbol(root1,root2){
    if(root1===null && root2===null){
        return true;
    }
    if(root1 === null || root2 === null){
        return false;
    }
    if(root1.val !== root2.val){
        return false;
    }
    return isSymbol(root1.left,root2.right)&&isSymbol(root1.right, root2.left);
}

