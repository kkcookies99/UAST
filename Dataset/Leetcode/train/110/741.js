 var XXX = function(root) {
    if(!root) return true;
    if(!root.left&&!root.right) return true;
    
    let lh = getTreeHeight(root.left,0);
    let rh = getTreeHeight(root.right,0);

    let bool = Math.abs(lh-rh)>1?false:true;

    if(bool){
        return XXX(root.left) && XXX(root.right);
    }else{
        return false;
    }
    
};
    
function getTreeHeight(temp){
    if(!temp) return 0;
    return 1 + Math.max(getTreeHeight(temp.left), getTreeHeight(temp.right));
};

