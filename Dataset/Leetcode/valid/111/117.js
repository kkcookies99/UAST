var XXX = function(root) {
    if(root===null){
        return 0;
    }
    var step=1,
        queue=[root],
        arr=[];
    while(true){
        var node=queue.shift();
        if(node.left==null&&node.right==null){
            return step;
        }
        if(node.left!==null){
            arr.push(node.left);
        }
        if(node.right!==null){
            arr.push(node.right);
        }
        if(queue.length===0){
            queue.push(...arr);
            arr=[];
            step+=1;
        }
    }
};

