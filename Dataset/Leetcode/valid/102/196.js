var XXX = function(root) {
    if(!root) return [];
    const q = [root]
    const res = []
    while(q.length){
        let len = q.length;
        res.push([]);
        while(len--){
            const n = q.shift()
            res[res.length -1].push(n.val);
            if(n.left) q.push(n.left)
            if(n.right) q.push(n.right)
        }
    }
    return res
};

