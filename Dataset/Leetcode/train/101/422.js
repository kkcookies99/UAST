 var XXX = function(root) {
    const queue = [root, root];
    while(queue.length) {
        const l = queue.pop();
        const r = queue.pop();
        if(!l && !r) continue;
        if(!l || !r || l.val !== r.val) return false;
        queue.push(l.left,r.right,l.right,r.left)
    }
    return true;
};

