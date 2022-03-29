var XXX = function(root) {
    const queue = [[root, 0]]; 
    if(root === null) return 0;
    while(queue.length) {
        const [current, path] = queue.shift();
        if(!current) continue;
        if(!current.left && !current.right) {
            return path + 1;
        }
        
        queue.push([current.left, path + 1], [current.right, path + 1])
    }
};

