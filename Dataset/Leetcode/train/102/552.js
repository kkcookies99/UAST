var XXX = function(root) {
    const res = [];
    function traverse(node, i) {
        if (!node) return;
        if (!res[i]) res[i] = [];
        res[i].push(node.val);
        i++;
        traverse(node.left, i);
        traverse(node.right, i);
    }
    traverse(root, 0);
    return res;
};


