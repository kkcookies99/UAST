var XXX = function(root) {
    // 层序遍历
    const queue = [];
    let max = 1;

    if (!root) {
        return 0;
    } else {
        root.depth = 1;
        queue.push(root);
    }
    
    while(queue.length) {
        const current = queue.shift();
        const depth = current.depth + 1;
        
        if (current.left) {
            queue.push(Object.assign(current.left, {depth}))
        } 
        if (current.right) {
            queue.push(Object.assign(current.right, {depth}))
        }
        if (current.left || current.right) {
            max = Math.max(depth, max);
        }
    }
    
    return max;
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


