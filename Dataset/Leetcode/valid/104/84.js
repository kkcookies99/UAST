var XXX = function(root) {
    if(root == null)return 0;
    if(root) {
        return Math.max(1+XXX(root.left),1+XXX(root.right))
    }
};

