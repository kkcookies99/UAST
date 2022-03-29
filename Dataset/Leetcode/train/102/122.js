var XXX = function(root) {
    let result = [];
    if (!root) {
        return result;
    }
    const _gen = (node, level) => {
        if (Array.isArray(result[level])) {
            result[level].push(node.val);
        }
        else {
            result[level] = [node.val]
        }
        if (node.left) {
            _gen(node.left, level+1);
        }
        if (node.right) {
            _gen(node.right, level+1);
        }
    }
    _gen(root, 0);
    return result;
};

