var XXX = function(root) {
    if(!root) return [];
    var stack=[root];
    var res=[];
    while(stack.length){
        var len=stack.length;
        var temp=[];
        for(var i=0;i<len;i++){
            var node=stack.shift()
            temp.push(node.val);
            if(node.left) stack.push(node.left);
            if(node.right) stack.push(node.right);
        }
        res.push(temp);
    }
    return res;
};

