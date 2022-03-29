 var XXX = function(root) {
    // 分治法
    return mergeSort(root);
};

function mergeSort(node){
    if(!node){
        return [];
    }
    var res = [];
    var left = mergeSort(node.left);
    var right = mergeSort(node.right);
    res = res.concat(left);
    res = res.concat(node.val);
    res = res.concat(right);
    return res;
}

