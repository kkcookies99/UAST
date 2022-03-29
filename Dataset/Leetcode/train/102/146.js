var XXX = function(root) {
    const ans = []
    const queue = root ? [[root, 0]] : []
    while (queue.length) {
        const [currNode, currLevel] = queue.pop()
        if (currNode) {
            if (ans[currLevel]) {
                ans[currLevel].push(currNode.val)
            } else {
                ans[currLevel] = [currNode.val]
            }
            queue.unshift([currNode.left, currLevel + 1])
            queue.unshift([currNode.right, currLevel + 1])
        }
    }
    return ans
};

