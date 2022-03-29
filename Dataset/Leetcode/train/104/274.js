var XXX = function(root) {
    if (!root) return 0

    const stack = [{ node: root, deep: 0 }], // 存储未进行查找的节点
        nums = [] // 存储每个分叉点的深度
    let node,
        deep = 0
    while (stack.length) {
        node = stack.pop()
        deep = ++node.deep
        node = node.node
        // 将分叉点入栈
        node.left && stack.push({ node: node.left, deep })
        node.right && stack.push({ node: node.right, deep })
        // 记录本分叉点的最大深度
        if (!node.left && !node.right) nums.push(deep)
    } // 遍历结束，问题则转为了求数组中最大值

    return Math.max(...nums)
};

