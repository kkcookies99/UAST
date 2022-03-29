 var XXX = function(root) {
    let flag = false
    function getTreeHeight(rt) {
        if(!rt) return 0
        else if(!rt.left) {
            let right = getTreeHeight(rt.right)
            if(right > 1) flag = true
            return right + 1
        }
        else {
            let left = getTreeHeight(rt.left), right = getTreeHeight(rt.right)
            if(Math.abs(left - right) > 1) flag = true
            return Math.max(left, right) + 1
        }
    }
    getTreeHeight(root)
    return !flag
};

