var XXX = function(root) {
    if(!root){
        return 0;
    }
    let left=XXX(root.left)+1;
    let right=XXX(root.right)+1;
    if(!root.left||!root.right){
        return !root.left?right:left;
    }else{
        return Math.min(left,right);
    }
};

