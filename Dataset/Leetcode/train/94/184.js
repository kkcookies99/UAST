 var XXX = function(root) {
    var list = [];
    midumOrder(root,list);
    return list;
};

function midumOrder(root, list){
    if(root === null){
        return;
    }
    midumOrder(root.left, list);
    if(root.val){
        list.push(root.val);
    }
    midumOrder(root.right,list);
    return list;
}

