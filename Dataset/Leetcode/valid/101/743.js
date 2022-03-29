 var XXX = function(root) {
    // 判断两个树是否是镜像对称树
    const _symmetric = (root1, root2) => {
        if (root1 === null || root2 === null) {
            if (root1 === null && root2 === null) {
                return true
            } else {
                return false
            }
        } else {
            if (root1.val !== root2.val) {
                return false
            } else if (!_symmetric(root1.left, root2.right) || !_symmetric(root1.right, root2.left)) {
                return false
            } else {
                return true
            }
        }
    }
    if (root === null) {
        return true
    }
    return _symmetric(root.left, root.right)
};

