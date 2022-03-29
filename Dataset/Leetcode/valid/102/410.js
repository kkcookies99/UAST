var XXX = function(root) {
    let result = []

    if (!root) return result

    const queue = []

    queue.push(root)

    // 开启一个新的层级
    while(queue.length) {
        let length = queue.length

        let list = []

        // 开启遍历当层元素的循环
        while(length) {
            let cur = queue.shift()
            if (cur.val !== null) list.push(cur.val)

            if (cur.left !== null) queue.push(cur.left)
            if (cur.right !== null) queue.push(cur.right)

            length -= 1
        }

        result.push(list.concat([]))
    }
    return result
};

