 var XXX = function(root) {
    let copyRoot = JSON.parse(JSON.stringify(root))
    let invertedTree = invertTree(copyRoot)
    // console.log(root, invertedTree)
    return isSameTree(root, invertedTree)
};

const invertTree = (root) => {
    if (root === null) return null
    if (root.left === null && root.right === null) return root
    let temp = root.left
    root.left = root.right
    root.right = temp
    invertTree(root.left)
    invertTree(root.right)
    return root
}

const isSameTree = (p, q) => {
    if(p === null && q === null) return true
    if (p === null || q === null) return false
    if (p.val !== q.val) return false
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
};

