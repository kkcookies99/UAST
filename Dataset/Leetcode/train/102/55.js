var XXX = function(root) {
    var result = [];
    if(root==null){
        return result;
    }
    var queue = [];
    queue.push(root);

    while(queue.length){
        var temp = []
        var len = queue.length;
        for(let i = 0;i<len;i++){
            var node  = queue.shift();
            temp.push(node.val)
            if(node.left) {
                queue.push(node.left)
            }
            if(node.right) {
                queue.push(node.right)
            }
        }
        result.push(temp)
    }
    return result;
};

