 var XXX = function(root) {
    var ret = []
    if (!root) {
        return ret
    }
    function recuse(node) {
        if (node.left) {
            recuse(node.left)
        }
        ret.push(node.val)
        if (node.right) {
            recuse(node.right)
        }
    }
    
    recuse(root)
    return ret
};

