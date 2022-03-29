var XXX = function(root) {
    const res = [];
    
    const preOrderVisit = (node, cb, level = 0) => {
        if(!node) return;
        
        cb(node, level);
        
        const nextLevel = level + 1;
        
        preOrderVisit(node.left, cb, nextLevel);
        preOrderVisit(node.right, cb, nextLevel);
    };
    
    preOrderVisit(root, (node, level) => {
        if(!Array.isArray(res[level])) {
           res[level] = [node.val]; 
        } else {
            res[level].push(node.val);
        }
    });
    
    
    return res;
};

