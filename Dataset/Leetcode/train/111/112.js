var XXX = function(root) {
    let q = [root], deep = 0;
    while(q.length > 0 && root) {
        deep++;
        for(let i=0, len = q.length; i < len; ++i) {
            let n = q.shift();
            if(!n.left && !n.right) return deep;
            if(n.left) q.push(n.left);
            if(n.right) q.push(n.right);
        }
    }
    return deep;
};

