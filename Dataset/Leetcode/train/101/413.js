 var XXX = function(root) {
    if (!root) return true
    const parentQueue = [root], childQueue = []
    while (parentQueue.length || childQueue.length) {
        const p = parentQueue.shift()
        p && childQueue.push(p.left, p.right)
        if (parentQueue.length == 0) {
            let left = 0, right = childQueue.length - 1
            while (left < right) {
                let l = childQueue[left], r = childQueue[right]
                if (!l && !r){
                    left ++
                    right --
                    continue
                }
                if (!l || !r) {
                    return false
                }
                if (l.val != r.val) {
                    return false
                }
                left ++
                right --
            }
            parentQueue.push(...childQueue)
            childQueue.length = 0
        }
    }
    return true
};

