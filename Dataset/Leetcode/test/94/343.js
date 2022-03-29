 var XXX = function(root) {
    let res = [];
    let stack = [];
    while (stack.length > 0 || root !== null) {
        while(root !== null) {
            stack.push(root);
            root = root.left;
        }
        root = stack.pop()
        res.push(root.val);
        root = root.right;
    }
    return res;
};

