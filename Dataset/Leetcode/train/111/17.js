var XXX = function(root) {
    if(!root){
        return 0;
    }else if(root.left&&root.right){
        return Math.min(XXX(root.left)+1,XXX(root.right)+1);
    }else{
        return root.left ? XXX(root.left)+1 : XXX(root.right)+1;
    }
};

