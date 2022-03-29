 var XXX = function(root) {
    const ret = [];
    function traversal(root){
        if(!root)return;
        if(root.left){
            traversal(root.left);
        }
        ret.push(root.val);
        if(root.right){
            traversal(root.right);
        }
    }
    traversal(root);
    return ret;
};

